package com.robinhood.android.markdown.compose;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarkdownStyle.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\bMNOPQRSTBa\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\u0010\u0010=\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b>\u0010)J\t\u0010?\u001a\u00020\u0013HÆ\u0003J\u0010\u0010@\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bA\u0010.J\t\u0010B\u001a\u00020\u0017HÆ\u0003J~\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\t\u0010K\u001a\u00020LHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u00020\u0011¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0014\u001a\u00020\u0015¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u0002038G¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "", "blockQuote", "Lcom/robinhood/android/markdown/compose/MarkdownStyle$BlockQuote;", "list", "Lcom/robinhood/android/markdown/compose/MarkdownStyle$List;", "bulletList", "Lcom/robinhood/android/markdown/compose/MarkdownStyle$BulletList;", "code", "Lcom/robinhood/android/markdown/compose/MarkdownStyle$Code;", "defaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "heading", "Lcom/robinhood/android/markdown/compose/MarkdownStyle$Heading;", "link", "Lcom/robinhood/android/markdown/compose/MarkdownStyle$Link;", "textColor", "Landroidx/compose/ui/graphics/Color;", "thematicBreak", "Lcom/robinhood/android/markdown/compose/MarkdownStyle$ThematicBreak;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "paragraph", "Lcom/robinhood/android/markdown/compose/MarkdownStyle$Paragraph;", "<init>", "(Lcom/robinhood/android/markdown/compose/MarkdownStyle$BlockQuote;Lcom/robinhood/android/markdown/compose/MarkdownStyle$List;Lcom/robinhood/android/markdown/compose/MarkdownStyle$BulletList;Lcom/robinhood/android/markdown/compose/MarkdownStyle$Code;Landroidx/compose/ui/text/TextStyle;Lcom/robinhood/android/markdown/compose/MarkdownStyle$Heading;Lcom/robinhood/android/markdown/compose/MarkdownStyle$Link;JLcom/robinhood/android/markdown/compose/MarkdownStyle$ThematicBreak;ILcom/robinhood/android/markdown/compose/MarkdownStyle$Paragraph;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlockQuote", "()Lcom/robinhood/android/markdown/compose/MarkdownStyle$BlockQuote;", "getList", "()Lcom/robinhood/android/markdown/compose/MarkdownStyle$List;", "getBulletList", "()Lcom/robinhood/android/markdown/compose/MarkdownStyle$BulletList;", "getCode", "()Lcom/robinhood/android/markdown/compose/MarkdownStyle$Code;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getHeading", "()Lcom/robinhood/android/markdown/compose/MarkdownStyle$Heading;", "getLink", "()Lcom/robinhood/android/markdown/compose/MarkdownStyle$Link;", "getTextColor-0d7_KjU", "()J", "J", "getThematicBreak", "()Lcom/robinhood/android/markdown/compose/MarkdownStyle$ThematicBreak;", "getTextAlign-e0LSkKk", "()I", "I", "getParagraph", "()Lcom/robinhood/android/markdown/compose/MarkdownStyle$Paragraph;", "defaultLineHeightPadding", "Landroidx/compose/ui/unit/Dp;", "getDefaultLineHeightPadding", "(Landroidx/compose/runtime/Composer;I)F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component8-0d7_KjU", "component9", "component10", "component10-e0LSkKk", "component11", "copy", "copy-R0sFphs", "(Lcom/robinhood/android/markdown/compose/MarkdownStyle$BlockQuote;Lcom/robinhood/android/markdown/compose/MarkdownStyle$List;Lcom/robinhood/android/markdown/compose/MarkdownStyle$BulletList;Lcom/robinhood/android/markdown/compose/MarkdownStyle$Code;Landroidx/compose/ui/text/TextStyle;Lcom/robinhood/android/markdown/compose/MarkdownStyle$Heading;Lcom/robinhood/android/markdown/compose/MarkdownStyle$Link;JLcom/robinhood/android/markdown/compose/MarkdownStyle$ThematicBreak;ILcom/robinhood/android/markdown/compose/MarkdownStyle$Paragraph;)Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "equals", "", "other", "hashCode", "", "toString", "", "Code", "BlockQuote", "List", "BulletList", "Heading", "Link", "ThematicBreak", "Paragraph", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final /* data */ class MarkdownStyle {
    public static final int $stable = 0;
    private final BlockQuote blockQuote;
    private final BulletList bulletList;
    private final Code code;
    private final TextStyle defaultTextStyle;
    private final Heading heading;
    private final Link link;
    private final List list;
    private final Paragraph paragraph;
    private final int textAlign;
    private final long textColor;
    private final ThematicBreak thematicBreak;

    public /* synthetic */ MarkdownStyle(BlockQuote blockQuote, List list, BulletList bulletList, Code code, TextStyle textStyle, Heading heading, Link link, long j, ThematicBreak thematicBreak, int i, Paragraph paragraph, DefaultConstructorMarker defaultConstructorMarker) {
        this(blockQuote, list, bulletList, code, textStyle, heading, link, j, thematicBreak, i, paragraph);
    }

    /* renamed from: copy-R0sFphs$default, reason: not valid java name */
    public static /* synthetic */ MarkdownStyle m16260copyR0sFphs$default(MarkdownStyle markdownStyle, BlockQuote blockQuote, List list, BulletList bulletList, Code code, TextStyle textStyle, Heading heading, Link link, long j, ThematicBreak thematicBreak, int i, Paragraph paragraph, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blockQuote = markdownStyle.blockQuote;
        }
        if ((i2 & 2) != 0) {
            list = markdownStyle.list;
        }
        if ((i2 & 4) != 0) {
            bulletList = markdownStyle.bulletList;
        }
        if ((i2 & 8) != 0) {
            code = markdownStyle.code;
        }
        if ((i2 & 16) != 0) {
            textStyle = markdownStyle.defaultTextStyle;
        }
        if ((i2 & 32) != 0) {
            heading = markdownStyle.heading;
        }
        if ((i2 & 64) != 0) {
            link = markdownStyle.link;
        }
        if ((i2 & 128) != 0) {
            j = markdownStyle.textColor;
        }
        if ((i2 & 256) != 0) {
            thematicBreak = markdownStyle.thematicBreak;
        }
        if ((i2 & 512) != 0) {
            i = markdownStyle.textAlign;
        }
        if ((i2 & 1024) != 0) {
            paragraph = markdownStyle.paragraph;
        }
        Paragraph paragraph2 = paragraph;
        ThematicBreak thematicBreak2 = thematicBreak;
        long j2 = j;
        Heading heading2 = heading;
        Link link2 = link;
        Code code2 = code;
        TextStyle textStyle2 = textStyle;
        BulletList bulletList2 = bulletList;
        return markdownStyle.m16263copyR0sFphs(blockQuote, list, bulletList2, code2, textStyle2, heading2, link2, j2, thematicBreak2, i, paragraph2);
    }

    /* renamed from: component1, reason: from getter */
    public final BlockQuote getBlockQuote() {
        return this.blockQuote;
    }

    /* renamed from: component10-e0LSkKk, reason: not valid java name and from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: component11, reason: from getter */
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    /* renamed from: component2, reason: from getter */
    public final List getList() {
        return this.list;
    }

    /* renamed from: component3, reason: from getter */
    public final BulletList getBulletList() {
        return this.bulletList;
    }

    /* renamed from: component4, reason: from getter */
    public final Code getCode() {
        return this.code;
    }

    /* renamed from: component5, reason: from getter */
    public final TextStyle getDefaultTextStyle() {
        return this.defaultTextStyle;
    }

    /* renamed from: component6, reason: from getter */
    public final Heading getHeading() {
        return this.heading;
    }

    /* renamed from: component7, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: component9, reason: from getter */
    public final ThematicBreak getThematicBreak() {
        return this.thematicBreak;
    }

    /* renamed from: copy-R0sFphs, reason: not valid java name */
    public final MarkdownStyle m16263copyR0sFphs(BlockQuote blockQuote, List list, BulletList bulletList, Code code, TextStyle defaultTextStyle, Heading heading, Link link, long textColor, ThematicBreak thematicBreak, int textAlign, Paragraph paragraph) {
        Intrinsics.checkNotNullParameter(blockQuote, "blockQuote");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(bulletList, "bulletList");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(defaultTextStyle, "defaultTextStyle");
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(thematicBreak, "thematicBreak");
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        return new MarkdownStyle(blockQuote, list, bulletList, code, defaultTextStyle, heading, link, textColor, thematicBreak, textAlign, paragraph, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownStyle)) {
            return false;
        }
        MarkdownStyle markdownStyle = (MarkdownStyle) other;
        return Intrinsics.areEqual(this.blockQuote, markdownStyle.blockQuote) && Intrinsics.areEqual(this.list, markdownStyle.list) && Intrinsics.areEqual(this.bulletList, markdownStyle.bulletList) && Intrinsics.areEqual(this.code, markdownStyle.code) && Intrinsics.areEqual(this.defaultTextStyle, markdownStyle.defaultTextStyle) && Intrinsics.areEqual(this.heading, markdownStyle.heading) && Intrinsics.areEqual(this.link, markdownStyle.link) && Color.m6707equalsimpl0(this.textColor, markdownStyle.textColor) && Intrinsics.areEqual(this.thematicBreak, markdownStyle.thematicBreak) && TextAlign.m7915equalsimpl0(this.textAlign, markdownStyle.textAlign) && Intrinsics.areEqual(this.paragraph, markdownStyle.paragraph);
    }

    public int hashCode() {
        return (((((((((((((((((((this.blockQuote.hashCode() * 31) + this.list.hashCode()) * 31) + this.bulletList.hashCode()) * 31) + this.code.hashCode()) * 31) + this.defaultTextStyle.hashCode()) * 31) + this.heading.hashCode()) * 31) + this.link.hashCode()) * 31) + Color.m6713hashCodeimpl(this.textColor)) * 31) + this.thematicBreak.hashCode()) * 31) + TextAlign.m7916hashCodeimpl(this.textAlign)) * 31) + this.paragraph.hashCode();
    }

    public String toString() {
        return "MarkdownStyle(blockQuote=" + this.blockQuote + ", list=" + this.list + ", bulletList=" + this.bulletList + ", code=" + this.code + ", defaultTextStyle=" + this.defaultTextStyle + ", heading=" + this.heading + ", link=" + this.link + ", textColor=" + Color.m6714toStringimpl(this.textColor) + ", thematicBreak=" + this.thematicBreak + ", textAlign=" + TextAlign.m7917toStringimpl(this.textAlign) + ", paragraph=" + this.paragraph + ")";
    }

    private MarkdownStyle(BlockQuote blockQuote, List list, BulletList bulletList, Code code, TextStyle defaultTextStyle, Heading heading, Link link, long j, ThematicBreak thematicBreak, int i, Paragraph paragraph) {
        Intrinsics.checkNotNullParameter(blockQuote, "blockQuote");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(bulletList, "bulletList");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(defaultTextStyle, "defaultTextStyle");
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(thematicBreak, "thematicBreak");
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        this.blockQuote = blockQuote;
        this.list = list;
        this.bulletList = bulletList;
        this.code = code;
        this.defaultTextStyle = defaultTextStyle;
        this.heading = heading;
        this.link = link;
        this.textColor = j;
        this.thematicBreak = thematicBreak;
        this.textAlign = i;
        this.paragraph = paragraph;
    }

    public final BlockQuote getBlockQuote() {
        return this.blockQuote;
    }

    public final List getList() {
        return this.list;
    }

    public final BulletList getBulletList() {
        return this.bulletList;
    }

    public final Code getCode() {
        return this.code;
    }

    public final TextStyle getDefaultTextStyle() {
        return this.defaultTextStyle;
    }

    public final Heading getHeading() {
        return this.heading;
    }

    public final Link getLink() {
        return this.link;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m16265getTextColor0d7_KjU() {
        return this.textColor;
    }

    public final ThematicBreak getThematicBreak() {
        return this.thematicBreak;
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m16264getTextAligne0LSkKk() {
        return this.textAlign;
    }

    public /* synthetic */ MarkdownStyle(BlockQuote blockQuote, List list, BulletList bulletList, Code code, TextStyle textStyle, Heading heading, Link link, long j, ThematicBreak thematicBreak, int i, Paragraph paragraph, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(blockQuote, list, bulletList, code, textStyle, heading, link, j, thematicBreak, i, (i2 & 1024) != 0 ? new Paragraph(true) : paragraph, null);
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    @JvmName
    public final float getDefaultLineHeightPadding(Composer composer, int i) {
        float fMo5011toDpGaN1DYA;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(890911286, i, -1, "com.robinhood.android.markdown.compose.MarkdownStyle.<get-defaultLineHeightPadding> (MarkdownStyle.kt:29)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        TextStyle textStyle = this.defaultTextStyle;
        if (TextUnit.m8076isEmimpl(textStyle.m7668getLineHeightXSAIIZE())) {
            fMo5011toDpGaN1DYA = density.mo5011toDpGaN1DYA(TextUnit2.getSp(TextUnit.m8074getValueimpl(textStyle.m7662getFontSizeXSAIIZE()) * TextUnit.m8074getValueimpl(textStyle.m7668getLineHeightXSAIIZE())));
        } else {
            fMo5011toDpGaN1DYA = density.mo5011toDpGaN1DYA(TextUnit2.getSp(TextUnit.m8074getValueimpl(textStyle.m7668getLineHeightXSAIIZE())));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo5011toDpGaN1DYA;
    }

    /* compiled from: MarkdownStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle$Code;", "", "bg", "Landroidx/compose/ui/graphics/Color;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "<init>", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBg-0d7_KjU", "()J", "J", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "component1-0d7_KjU", "component2", "copy", "copy-DxMtmZc", "(JLandroidx/compose/ui/text/TextStyle;)Lcom/robinhood/android/markdown/compose/MarkdownStyle$Code;", "equals", "", "other", "hashCode", "", "toString", "", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Code {
        public static final int $stable = 0;
        private final long bg;
        private final TextStyle textStyle;

        public /* synthetic */ Code(long j, TextStyle textStyle, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, textStyle);
        }

        /* renamed from: copy-DxMtmZc$default, reason: not valid java name */
        public static /* synthetic */ Code m16270copyDxMtmZc$default(Code code, long j, TextStyle textStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                j = code.bg;
            }
            if ((i & 2) != 0) {
                textStyle = code.textStyle;
            }
            return code.m16272copyDxMtmZc(j, textStyle);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBg() {
            return this.bg;
        }

        /* renamed from: component2, reason: from getter */
        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        /* renamed from: copy-DxMtmZc, reason: not valid java name */
        public final Code m16272copyDxMtmZc(long bg, TextStyle textStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            return new Code(bg, textStyle, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Code)) {
                return false;
            }
            Code code = (Code) other;
            return Color.m6707equalsimpl0(this.bg, code.bg) && Intrinsics.areEqual(this.textStyle, code.textStyle);
        }

        public int hashCode() {
            return (Color.m6713hashCodeimpl(this.bg) * 31) + this.textStyle.hashCode();
        }

        public String toString() {
            return "Code(bg=" + Color.m6714toStringimpl(this.bg) + ", textStyle=" + this.textStyle + ")";
        }

        private Code(long j, TextStyle textStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.bg = j;
            this.textStyle = textStyle;
        }

        /* renamed from: getBg-0d7_KjU, reason: not valid java name */
        public final long m16273getBg0d7_KjU() {
            return this.bg;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }
    }

    /* compiled from: MarkdownStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle$BlockQuote;", "", "bg", "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBg-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/robinhood/android/markdown/compose/MarkdownStyle$BlockQuote;", "equals", "", "other", "hashCode", "", "toString", "", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BlockQuote {
        public static final int $stable = 0;
        private final long bg;

        public /* synthetic */ BlockQuote(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ BlockQuote m16266copy8_81llA$default(BlockQuote blockQuote, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = blockQuote.bg;
            }
            return blockQuote.m16268copy8_81llA(j);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBg() {
            return this.bg;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final BlockQuote m16268copy8_81llA(long bg) {
            return new BlockQuote(bg, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BlockQuote) && Color.m6707equalsimpl0(this.bg, ((BlockQuote) other).bg);
        }

        public int hashCode() {
            return Color.m6713hashCodeimpl(this.bg);
        }

        public String toString() {
            return "BlockQuote(bg=" + Color.m6714toStringimpl(this.bg) + ")";
        }

        private BlockQuote(long j) {
            this.bg = j;
        }

        /* renamed from: getBg-0d7_KjU, reason: not valid java name */
        public final long m16269getBg0d7_KjU() {
            return this.bg;
        }
    }

    /* compiled from: MarkdownStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle$List;", "", "initialIndentSize", "Landroidx/compose/ui/unit/Dp;", "subsequentIndentSize", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getInitialIndentSize-D9Ej5fM", "()F", "F", "getSubsequentIndentSize-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/android/markdown/compose/MarkdownStyle$List;", "equals", "", "other", "hashCode", "", "toString", "", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class List {
        public static final int $stable = 0;
        private final float initialIndentSize;
        private final float subsequentIndentSize;

        public /* synthetic */ List(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
        public static /* synthetic */ List m16278copyYgX7TsA$default(List list, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = list.initialIndentSize;
            }
            if ((i & 2) != 0) {
                f2 = list.subsequentIndentSize;
            }
            return list.m16281copyYgX7TsA(f, f2);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getInitialIndentSize() {
            return this.initialIndentSize;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSubsequentIndentSize() {
            return this.subsequentIndentSize;
        }

        /* renamed from: copy-YgX7TsA, reason: not valid java name */
        public final List m16281copyYgX7TsA(float initialIndentSize, float subsequentIndentSize) {
            return new List(initialIndentSize, subsequentIndentSize, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof List)) {
                return false;
            }
            List list = (List) other;
            return C2002Dp.m7997equalsimpl0(this.initialIndentSize, list.initialIndentSize) && C2002Dp.m7997equalsimpl0(this.subsequentIndentSize, list.subsequentIndentSize);
        }

        public int hashCode() {
            return (C2002Dp.m7998hashCodeimpl(this.initialIndentSize) * 31) + C2002Dp.m7998hashCodeimpl(this.subsequentIndentSize);
        }

        public String toString() {
            return "List(initialIndentSize=" + C2002Dp.m7999toStringimpl(this.initialIndentSize) + ", subsequentIndentSize=" + C2002Dp.m7999toStringimpl(this.subsequentIndentSize) + ")";
        }

        private List(float f, float f2) {
            this.initialIndentSize = f;
            this.subsequentIndentSize = f2;
        }

        /* renamed from: getInitialIndentSize-D9Ej5fM, reason: not valid java name */
        public final float m16282getInitialIndentSizeD9Ej5fM() {
            return this.initialIndentSize;
        }

        /* renamed from: getSubsequentIndentSize-D9Ej5fM, reason: not valid java name */
        public final float m16283getSubsequentIndentSizeD9Ej5fM() {
            return this.subsequentIndentSize;
        }
    }

    /* compiled from: MarkdownStyle.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle$BulletList;", "", "bulletMarker1", "", "bulletMarker2", "bulletMarker3", "bulletSeparator", "", "<init>", "(CCCLjava/lang/String;)V", "getBulletMarker1", "()C", "getBulletMarker2", "getBulletMarker3", "getBulletSeparator", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BulletList {
        public static final int $stable = 0;
        private final char bulletMarker1;
        private final char bulletMarker2;
        private final char bulletMarker3;
        private final String bulletSeparator;

        public static /* synthetic */ BulletList copy$default(BulletList bulletList, char c, char c2, char c3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                c = bulletList.bulletMarker1;
            }
            if ((i & 2) != 0) {
                c2 = bulletList.bulletMarker2;
            }
            if ((i & 4) != 0) {
                c3 = bulletList.bulletMarker3;
            }
            if ((i & 8) != 0) {
                str = bulletList.bulletSeparator;
            }
            return bulletList.copy(c, c2, c3, str);
        }

        /* renamed from: component1, reason: from getter */
        public final char getBulletMarker1() {
            return this.bulletMarker1;
        }

        /* renamed from: component2, reason: from getter */
        public final char getBulletMarker2() {
            return this.bulletMarker2;
        }

        /* renamed from: component3, reason: from getter */
        public final char getBulletMarker3() {
            return this.bulletMarker3;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBulletSeparator() {
            return this.bulletSeparator;
        }

        public final BulletList copy(char bulletMarker1, char bulletMarker2, char bulletMarker3, String bulletSeparator) {
            Intrinsics.checkNotNullParameter(bulletSeparator, "bulletSeparator");
            return new BulletList(bulletMarker1, bulletMarker2, bulletMarker3, bulletSeparator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BulletList)) {
                return false;
            }
            BulletList bulletList = (BulletList) other;
            return this.bulletMarker1 == bulletList.bulletMarker1 && this.bulletMarker2 == bulletList.bulletMarker2 && this.bulletMarker3 == bulletList.bulletMarker3 && Intrinsics.areEqual(this.bulletSeparator, bulletList.bulletSeparator);
        }

        public int hashCode() {
            return (((((Character.hashCode(this.bulletMarker1) * 31) + Character.hashCode(this.bulletMarker2)) * 31) + Character.hashCode(this.bulletMarker3)) * 31) + this.bulletSeparator.hashCode();
        }

        public String toString() {
            return "BulletList(bulletMarker1=" + this.bulletMarker1 + ", bulletMarker2=" + this.bulletMarker2 + ", bulletMarker3=" + this.bulletMarker3 + ", bulletSeparator=" + this.bulletSeparator + ")";
        }

        public BulletList(char c, char c2, char c3, String bulletSeparator) {
            Intrinsics.checkNotNullParameter(bulletSeparator, "bulletSeparator");
            this.bulletMarker1 = c;
            this.bulletMarker2 = c2;
            this.bulletMarker3 = c3;
            this.bulletSeparator = bulletSeparator;
        }

        public final char getBulletMarker1() {
            return this.bulletMarker1;
        }

        public final char getBulletMarker2() {
            return this.bulletMarker2;
        }

        public final char getBulletMarker3() {
            return this.bulletMarker3;
        }

        public /* synthetic */ BulletList(char c, char c2, char c3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c, c2, c3, (i & 8) != 0 ? "\t" : str);
        }

        public final String getBulletSeparator() {
            return this.bulletSeparator;
        }
    }

    /* compiled from: MarkdownStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle$Heading;", "", "h1", "Landroidx/compose/ui/text/TextStyle;", "h2", "h3", "h4", "h5", "h6", "appendNewLine", "", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Z)V", "getH1", "()Landroidx/compose/ui/text/TextStyle;", "getH2", "getH3", "getH4", "getH5", "getH6", "getAppendNewLine", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Heading {
        public static final int $stable = 0;
        private final boolean appendNewLine;
        private final TextStyle h1;
        private final TextStyle h2;
        private final TextStyle h3;
        private final TextStyle h4;
        private final TextStyle h5;
        private final TextStyle h6;

        public static /* synthetic */ Heading copy$default(Heading heading, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                textStyle = heading.h1;
            }
            if ((i & 2) != 0) {
                textStyle2 = heading.h2;
            }
            if ((i & 4) != 0) {
                textStyle3 = heading.h3;
            }
            if ((i & 8) != 0) {
                textStyle4 = heading.h4;
            }
            if ((i & 16) != 0) {
                textStyle5 = heading.h5;
            }
            if ((i & 32) != 0) {
                textStyle6 = heading.h6;
            }
            if ((i & 64) != 0) {
                z = heading.appendNewLine;
            }
            TextStyle textStyle7 = textStyle6;
            boolean z2 = z;
            TextStyle textStyle8 = textStyle5;
            TextStyle textStyle9 = textStyle3;
            return heading.copy(textStyle, textStyle2, textStyle9, textStyle4, textStyle8, textStyle7, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextStyle getH1() {
            return this.h1;
        }

        /* renamed from: component2, reason: from getter */
        public final TextStyle getH2() {
            return this.h2;
        }

        /* renamed from: component3, reason: from getter */
        public final TextStyle getH3() {
            return this.h3;
        }

        /* renamed from: component4, reason: from getter */
        public final TextStyle getH4() {
            return this.h4;
        }

        /* renamed from: component5, reason: from getter */
        public final TextStyle getH5() {
            return this.h5;
        }

        /* renamed from: component6, reason: from getter */
        public final TextStyle getH6() {
            return this.h6;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAppendNewLine() {
            return this.appendNewLine;
        }

        public final Heading copy(TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, boolean appendNewLine) {
            Intrinsics.checkNotNullParameter(h1, "h1");
            Intrinsics.checkNotNullParameter(h2, "h2");
            Intrinsics.checkNotNullParameter(h3, "h3");
            Intrinsics.checkNotNullParameter(h4, "h4");
            Intrinsics.checkNotNullParameter(h5, "h5");
            Intrinsics.checkNotNullParameter(h6, "h6");
            return new Heading(h1, h2, h3, h4, h5, h6, appendNewLine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Heading)) {
                return false;
            }
            Heading heading = (Heading) other;
            return Intrinsics.areEqual(this.h1, heading.h1) && Intrinsics.areEqual(this.h2, heading.h2) && Intrinsics.areEqual(this.h3, heading.h3) && Intrinsics.areEqual(this.h4, heading.h4) && Intrinsics.areEqual(this.h5, heading.h5) && Intrinsics.areEqual(this.h6, heading.h6) && this.appendNewLine == heading.appendNewLine;
        }

        public int hashCode() {
            return (((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + Boolean.hashCode(this.appendNewLine);
        }

        public String toString() {
            return "Heading(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", appendNewLine=" + this.appendNewLine + ")";
        }

        public Heading(TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, boolean z) {
            Intrinsics.checkNotNullParameter(h1, "h1");
            Intrinsics.checkNotNullParameter(h2, "h2");
            Intrinsics.checkNotNullParameter(h3, "h3");
            Intrinsics.checkNotNullParameter(h4, "h4");
            Intrinsics.checkNotNullParameter(h5, "h5");
            Intrinsics.checkNotNullParameter(h6, "h6");
            this.h1 = h1;
            this.h2 = h2;
            this.h3 = h3;
            this.h4 = h4;
            this.h5 = h5;
            this.h6 = h6;
            this.appendNewLine = z;
        }

        public final TextStyle getH1() {
            return this.h1;
        }

        public final TextStyle getH2() {
            return this.h2;
        }

        public final TextStyle getH3() {
            return this.h3;
        }

        public final TextStyle getH4() {
            return this.h4;
        }

        public final TextStyle getH5() {
            return this.h5;
        }

        public final TextStyle getH6() {
            return this.h6;
        }

        public final boolean getAppendNewLine() {
            return this.appendNewLine;
        }
    }

    /* compiled from: MarkdownStyle.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle$Link;", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "bold", "", "dottedUnderline", "<init>", "(JZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getBold", "()Z", "getDottedUnderline", "component1", "component1-0d7_KjU", "component2", "component3", "copy", "copy-ek8zF_U", "(JZZ)Lcom/robinhood/android/markdown/compose/MarkdownStyle$Link;", "equals", "other", "hashCode", "", "toString", "", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Link {
        public static final int $stable = 0;
        private final boolean bold;
        private final long color;
        private final boolean dottedUnderline;

        public /* synthetic */ Link(long j, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, z, z2);
        }

        /* renamed from: copy-ek8zF_U$default, reason: not valid java name */
        public static /* synthetic */ Link m16274copyek8zF_U$default(Link link, long j, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = link.color;
            }
            if ((i & 2) != 0) {
                z = link.bold;
            }
            if ((i & 4) != 0) {
                z2 = link.dottedUnderline;
            }
            return link.m16276copyek8zF_U(j, z, z2);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getBold() {
            return this.bold;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getDottedUnderline() {
            return this.dottedUnderline;
        }

        /* renamed from: copy-ek8zF_U, reason: not valid java name */
        public final Link m16276copyek8zF_U(long color, boolean bold, boolean dottedUnderline) {
            return new Link(color, bold, dottedUnderline, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return Color.m6707equalsimpl0(this.color, link.color) && this.bold == link.bold && this.dottedUnderline == link.dottedUnderline;
        }

        public int hashCode() {
            return (((Color.m6713hashCodeimpl(this.color) * 31) + Boolean.hashCode(this.bold)) * 31) + Boolean.hashCode(this.dottedUnderline);
        }

        public String toString() {
            return "Link(color=" + Color.m6714toStringimpl(this.color) + ", bold=" + this.bold + ", dottedUnderline=" + this.dottedUnderline + ")";
        }

        private Link(long j, boolean z, boolean z2) {
            this.color = j;
            this.bold = z;
            this.dottedUnderline = z2;
        }

        public /* synthetic */ Link(long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, null);
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m16277getColor0d7_KjU() {
            return this.color;
        }

        public final boolean getBold() {
            return this.bold;
        }

        public final boolean getDottedUnderline() {
            return this.dottedUnderline;
        }
    }

    /* compiled from: MarkdownStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle$ThematicBreak;", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "bottomPadding", "<init>", "(JFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getThickness-D9Ej5fM", "()F", "F", "getBottomPadding-D9Ej5fM", "component1", "component1-0d7_KjU", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "copy", "copy-fUABb90", "(JFF)Lcom/robinhood/android/markdown/compose/MarkdownStyle$ThematicBreak;", "equals", "", "other", "hashCode", "", "toString", "", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ThematicBreak {
        public static final int $stable = 0;
        private final float bottomPadding;
        private final long color;
        private final float thickness;

        public /* synthetic */ ThematicBreak(long j, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, f, f2);
        }

        /* renamed from: copy-fUABb90$default, reason: not valid java name */
        public static /* synthetic */ ThematicBreak m16284copyfUABb90$default(ThematicBreak thematicBreak, long j, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = thematicBreak.color;
            }
            if ((i & 2) != 0) {
                f = thematicBreak.thickness;
            }
            if ((i & 4) != 0) {
                f2 = thematicBreak.bottomPadding;
            }
            return thematicBreak.m16288copyfUABb90(j, f, f2);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getThickness() {
            return this.thickness;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: copy-fUABb90, reason: not valid java name */
        public final ThematicBreak m16288copyfUABb90(long color, float thickness, float bottomPadding) {
            return new ThematicBreak(color, thickness, bottomPadding, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThematicBreak)) {
                return false;
            }
            ThematicBreak thematicBreak = (ThematicBreak) other;
            return Color.m6707equalsimpl0(this.color, thematicBreak.color) && C2002Dp.m7997equalsimpl0(this.thickness, thematicBreak.thickness) && C2002Dp.m7997equalsimpl0(this.bottomPadding, thematicBreak.bottomPadding);
        }

        public int hashCode() {
            return (((Color.m6713hashCodeimpl(this.color) * 31) + C2002Dp.m7998hashCodeimpl(this.thickness)) * 31) + C2002Dp.m7998hashCodeimpl(this.bottomPadding);
        }

        public String toString() {
            return "ThematicBreak(color=" + Color.m6714toStringimpl(this.color) + ", thickness=" + C2002Dp.m7999toStringimpl(this.thickness) + ", bottomPadding=" + C2002Dp.m7999toStringimpl(this.bottomPadding) + ")";
        }

        private ThematicBreak(long j, float f, float f2) {
            this.color = j;
            this.thickness = f;
            this.bottomPadding = f2;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m16290getColor0d7_KjU() {
            return this.color;
        }

        /* renamed from: getThickness-D9Ej5fM, reason: not valid java name */
        public final float m16291getThicknessD9Ej5fM() {
            return this.thickness;
        }

        /* renamed from: getBottomPadding-D9Ej5fM, reason: not valid java name */
        public final float m16289getBottomPaddingD9Ej5fM() {
            return this.bottomPadding;
        }
    }

    /* compiled from: MarkdownStyle.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/MarkdownStyle$Paragraph;", "", "appendExtraNewLine", "", "<init>", "(Z)V", "getAppendExtraNewLine", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Paragraph {
        public static final int $stable = 0;
        private final boolean appendExtraNewLine;

        public static /* synthetic */ Paragraph copy$default(Paragraph paragraph, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = paragraph.appendExtraNewLine;
            }
            return paragraph.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAppendExtraNewLine() {
            return this.appendExtraNewLine;
        }

        public final Paragraph copy(boolean appendExtraNewLine) {
            return new Paragraph(appendExtraNewLine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Paragraph) && this.appendExtraNewLine == ((Paragraph) other).appendExtraNewLine;
        }

        public int hashCode() {
            return Boolean.hashCode(this.appendExtraNewLine);
        }

        public String toString() {
            return "Paragraph(appendExtraNewLine=" + this.appendExtraNewLine + ")";
        }

        public Paragraph(boolean z) {
            this.appendExtraNewLine = z;
        }

        public final boolean getAppendExtraNewLine() {
            return this.appendExtraNewLine;
        }
    }
}
