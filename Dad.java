public class Dad extends Rar
{
        public Dad() {}

        public Dad(String name)
        {
                super(name); // use constructor from Rar
                // can put some more code here if you like
        }

        public String tellDadJoke()
        {
                return "Why do parallel planes never go out?\nBecause they never meet!";
        }

        // overload
        public String nameHeart()
        {
                return super.nameHeart() + " heart";
        }

        public String ohNaNa() // what's my name?
        {
                return this.name + this.howLoud(); //why can't we do this.loudness?
        }
}