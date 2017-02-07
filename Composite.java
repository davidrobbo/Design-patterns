package com.designpatterns.structural;

abstract class Content {
    public abstract String report();
}

public class TextEditor extends Content {
    private String contents;
    public TextEditor(String contents)
    {
        this.contents = contents;
    }

    public String getContents()
    {
        return this.contents;
    }

    public void setContents(String contents)
    {
        this.contents = contents;
    }

    public String report()
    {
        return "This class' contents are " + this.contents;
    }
}

public class Image extends Content {
    private String contents;
    public Image(String contents)
    {
        this.contents = contents;
    }

    public String getContents()
    {
        return this.contents;
    }

    public void setContents(String contents)
    {
        this.contents = contents;
    }

    public String report()
    {
        return "This class' contents are " + this.contents;
    }
}

public class ContentComposite extends Content {
    private List<Content> children;
    public ContentComposite()
    {
        this.contents = new ArrayList<String>();
    }

    public void add(Content content)
    {
        this.children.add(content);
    }

    public String report()
    {
        String returnString = "";
        for(Content c : this.children)
        {
            returnString += "This class' contents are " + c.contents;
        }
        return returnString;
    }
}
/* The composite pattern is one where an abstract class defines shared functionality
to be extended by two client classes. The 'single' client class is one which can
report on it's own contents. The 'bigger' class is one which is composed of
multiple of the 'single' classes. This way, the composite can both use the
functionality of the individual classes along with using and creating
greater functionality by composing information on all other classes */
