# Recursion
Recursion is useful in solving problems which can be broken down into smaller problems of the same kind. But when it comes to solving problems using Recursion there are several things to be taken care of. Let's take a simple example and try to understand those. Following is the pseudo code of finding factorial of a given number  using recursion
function factorial(x)
    if x is 0                    // base case
        return 1
    return x*factorial(x-1)       // break into smaller problem(s)
# Backtracking 
So, while solving a problem using recursion, we break the given problem into smaller ones. Let's say we have a problem  and we divided it into three smaller problems ,  and . Now it may be the case that the solution to  does not depend on all the three subproblems, in fact we don't even know on which one it depends.
Let's take a situation. Suppose you are standing in front of three tunnels, one of which is having a bag of gold at its end, but you don't know which one. So you'll try all three. First go in tunnel , if that is not the one, then come out of it, and go into tunnel , and again if that is not the one, come out of it and go into tunnel . So basically in backtracking we attempt solving a subproblem, and if we don't reach the desired solution, then undo whatever we did for solving that subproblem, and try solving another subproblem.
