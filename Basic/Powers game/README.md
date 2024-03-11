<h2><a href="https://www.geeksforgeeks.org/problems/powers-game3701/1?page=7&category=Arrays&difficulty=Basic&sortBy=submissions">Powers game</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given&nbsp;two integers <strong>X</strong>&nbsp;and <strong>N</strong>,&nbsp;you have to find an array such that it contains the frequency of index numbers occurring in (X<sup>1</sup> X<sup>2</sup> .... X<sup>N-1</sup>&nbsp;X<sup>N</sup>) .&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>X = 15, N = 3
<strong>Output:</strong> 0 1 2 2 0 3 0 1 0 0
<strong>Explanation:</strong> 15^1, 15^2, 15^3 ==&gt; 15, 225, 3375
An array which displays the frequency of 
its index numbers occuring in 15, 225 and 3375
Frequency of '0' = 0
Frequency of '1' = 1 (only once in 15)
Frequency of '2' = 2 (twice in 225)
Frequency of '3' = 2 (twice in 3375)
Frequency of '4' = 0
Frequency of '5' = 3 (thrice in '15', '225' and '3375')
Frequency of '6' = 0
Frequency of '7' = 1 (only once in '3375')
Frequency of '8' = 0
Frequency of '9' = 0
Resultant array:
0 1 2 2 0 3 0 1 0 0</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>X = 2, N = 4
<strong>Output:</strong> 0 1 1 0 1 0 1 0 1 0
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>getFreq()</strong>&nbsp;which takes the two integers&nbsp;<strong>x</strong>&nbsp;and&nbsp;<strong>n&nbsp;</strong>as parameters and returns an array of integers denoting the answer.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= X&nbsp;&lt;= 15<br>
1&nbsp;&lt;= N&nbsp;&lt;= 15</span></p>

<p>&nbsp;</p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Modular Arithmetic</code>&nbsp;<code>logical-thinking</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;