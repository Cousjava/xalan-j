/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 1999 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Xalan" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 1999, Lotus
 * Development Corporation., http://www.lotus.com.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.xalan.stree;

import org.xml.sax.Attributes;

/**
 * <meta name="usage" content="internal"/>
 * * This class represents an element in an HTML or XML document associated 
 * with a given namespace.
 * Elements may have attributes associated with them as well as children nodes.
 * Used in Indexed lookup.
 */
public class IndexedElemWithNS extends ElementImplWithNS
        implements IndexedElem
{

  /** Element's localName          */
  private String m_localName;

  /** Element's namespace URI          */
  private String m_uri;

  /** 
   * An integer indicating where this node's children can
   * be found in the indexed nodes list.          
   */
  private int m_index;

  /**
   * Constructor IndexedElemWithNS
   *
   *
   * @param doc Document Element
   * @param ns Element's namespace URI 
   * @param name Element's name
   */
  IndexedElemWithNS(DocumentImpl doc, String ns, String name)
  {
    super(doc, ns, name);
  }

  /**
   * Constructor IndexedElemWithNS
   *
   *
   * @param doc Document Element
   * @param ns Element's namespace URI
   * @param localName Element's local name
   * @param name Element's name
   * @param atts List of attributes associated with this element
   */
  IndexedElemWithNS(DocumentImpl doc, String ns, String localName,
                    String name, Attributes atts)
  {
    super(doc, ns, localName, name, atts);
  }

  /**
   * An integer indicating where this node's children can
   * be found in the indexed nodes list.
   *
   * @param anIndex Index of this node's children in nodes list to be set 
   */
  public void setIndex(int anIndex)
  {
    this.m_index = anIndex;
  }

  /**
   * An integer indicating where this node's children can
   * be found in the indexed nodes list.
   *
   * @return Index of this node's children in nodes list
   */
  public int getIndex()
  {
    return m_index;
  }
}
