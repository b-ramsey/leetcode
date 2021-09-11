package com.bramsey.home.leetcode.problem617;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncSolution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) throws ExecutionException, InterruptedException {
        return mergeTreesAsync(root1, root2).get();
    }

    private Future<TreeNode> mergeTreesAsync(TreeNode root1, TreeNode root2) {
        CompletableFuture<TreeNode> merged = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            if (root1 == null) {
                merged.complete(root2);
            }
            else if (root2 == null) {
                merged.complete(root1);
            }
            else {
                Future<TreeNode> left = mergeTreesAsync(root1.left, root2.left);
                Future<TreeNode> right = mergeTreesAsync(root1.right, root2.right);

                merged.complete(new TreeNode(root1.val + root2.val, left.get(), right.get()));

            }
            return null;
        });

        return merged;
    }
}
