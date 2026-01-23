package org.commonmark.internal;

import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;
import org.commonmark.text.Characters;

/* loaded from: classes23.dex */
public class FencedCodeBlockParser extends AbstractBlockParser {
    private final FencedCodeBlock block;
    private final char fenceChar;
    private String firstLine;
    private final int openingFenceLength;
    private StringBuilder otherLines;

    public FencedCodeBlockParser(char c, int i, int i2) {
        FencedCodeBlock fencedCodeBlock = new FencedCodeBlock();
        this.block = fencedCodeBlock;
        this.otherLines = new StringBuilder();
        this.fenceChar = c;
        this.openingFenceLength = i;
        fencedCodeBlock.setFenceCharacter(String.valueOf(c));
        fencedCodeBlock.setOpeningFenceLength(Integer.valueOf(i));
        fencedCodeBlock.setFenceIndent(i2);
    }

    @Override // org.commonmark.parser.block.BlockParser
    public Block getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public BlockContinue tryContinue(ParserState parserState) {
        int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
        int index = parserState.getIndex();
        CharSequence content = parserState.getLine().getContent();
        if (parserState.getIndent() < Parsing.CODE_BLOCK_INDENT && nextNonSpaceIndex < content.length() && tryClosing(content, nextNonSpaceIndex)) {
            return BlockContinue.finished();
        }
        int length = content.length();
        for (int fenceIndent = this.block.getFenceIndent(); fenceIndent > 0 && index < length && content.charAt(index) == ' '; fenceIndent--) {
            index++;
        }
        return BlockContinue.atIndex(index);
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public void addLine(SourceLine sourceLine) {
        if (this.firstLine == null) {
            this.firstLine = sourceLine.getContent().toString();
        } else {
            this.otherLines.append(sourceLine.getContent());
            this.otherLines.append('\n');
        }
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public void closeBlock() {
        this.block.setInfo(Escaping.unescapeString(this.firstLine.trim()));
        this.block.setLiteral(this.otherLines.toString());
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            int indent = parserState.getIndent();
            if (indent >= Parsing.CODE_BLOCK_INDENT) {
                return BlockStart.none();
            }
            int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
            FencedCodeBlockParser fencedCodeBlockParserCheckOpener = FencedCodeBlockParser.checkOpener(parserState.getLine().getContent(), nextNonSpaceIndex, indent);
            return fencedCodeBlockParserCheckOpener != null ? BlockStart.m3988of(fencedCodeBlockParserCheckOpener).atIndex(nextNonSpaceIndex + fencedCodeBlockParserCheckOpener.block.getOpeningFenceLength().intValue()) : BlockStart.none();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FencedCodeBlockParser checkOpener(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '`') {
                i3++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i4++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (Characters.find('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new FencedCodeBlockParser('`', i3, i2);
        }
        if (i4 < 3 || i3 != 0) {
            return null;
        }
        return new FencedCodeBlockParser('~', i4, i2);
    }

    private boolean tryClosing(CharSequence charSequence, int i) {
        int iSkip = Characters.skip(this.fenceChar, charSequence, i, charSequence.length()) - i;
        if (iSkip < this.openingFenceLength || Characters.skipSpaceTab(charSequence, i + iSkip, charSequence.length()) != charSequence.length()) {
            return false;
        }
        this.block.setClosingFenceLength(Integer.valueOf(iSkip));
        return true;
    }
}
