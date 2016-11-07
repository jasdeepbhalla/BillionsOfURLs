Implementing a scalable system to search for a bad URL from billions of URLS

Problem Statement:
1. Build a large scaled system to have optimized lookups for billions of URLS and scale the system horizontally. 
2. Checking if the given URL is bad or not (Remeber we are talking about billions of URLs here)
3. Checking if the given URL's IP Address is part of an existing subnet or not.

Approach:
Using Inverted Index HashMap: invertedIndex<BadString, [List of URLs containing BadStrings]>
Using Bloom Filers to get O(1) lookup (as we have millions of URLS)
Using Patricia Trees to check for bad IP addresses with bad subnets. 

Read More About Patricia Trees:
http://indigoo.com/petersblog/?p=45
