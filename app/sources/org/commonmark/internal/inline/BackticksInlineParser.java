package org.commonmark.internal.inline;

import org.commonmark.node.Code;
import org.commonmark.node.Text;
import org.commonmark.parser.beta.Position;
import org.commonmark.parser.beta.Scanner;
import org.commonmark.text.Characters;

/* loaded from: classes23.dex */
public class BackticksInlineParser implements InlineContentParser {
    @Override // org.commonmark.internal.inline.InlineContentParser
    public ParsedInline tryParse(InlineParserState inlineParserState) {
        Scanner scanner = inlineParserState.scanner();
        Position position = scanner.position();
        int iMatchMultiple = scanner.matchMultiple('`');
        Position position2 = scanner.position();
        while (scanner.find('`') > 0) {
            Position position3 = scanner.position();
            if (scanner.matchMultiple('`') == iMatchMultiple) {
                Code code = new Code();
                String strReplace = scanner.getSource(position2, position3).getContent().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && Characters.hasNonSpace(strReplace)) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                code.setLiteral(strReplace);
                return ParsedInline.m3982of(code, scanner.position());
            }
        }
        return ParsedInline.m3982of(new Text(scanner.getSource(position, position2).getContent()), position2);
    }
}
