bool isPalindrome(int x)
{
    char str[12] = {0}; // iNT_MIN is -2147483648
    sprintf(str, "%d", x);
    int head = 0;
    int tail = strlen(str)-1;    
    while (head < tail)
    {
        if (str[head] != str[tail])
        {
            return false;
        }
        head++;
        tail--;
    }
    
    return true;
}