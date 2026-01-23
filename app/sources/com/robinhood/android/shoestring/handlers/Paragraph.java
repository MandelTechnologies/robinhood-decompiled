package com.robinhood.android.shoestring.handlers;

import androidx.compose.p011ui.text.ParagraphStyle;
import androidx.compose.p011ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Paragraph.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u0010\u0010\n\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/shoestring/handlers/Paragraph;", "Lcom/robinhood/android/shoestring/handlers/SimpleParagraphStyleTagHandler;", "tagText", "", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "component1", "component2", "component2-XSAIIZE", "()J", "copy", "copy-mpE4wyQ", "(Ljava/lang/String;J)Lcom/robinhood/android/shoestring/handlers/Paragraph;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Paragraph extends SimpleParagraphStyleTagHandler {
    private static final String DEFAULT_TAG_TEXT = "p";
    private final long lineHeight;
    private final String tagText;
    public static final int $stable = 8;

    public /* synthetic */ Paragraph(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    /* renamed from: component1, reason: from getter */
    private final String getTagText() {
        return this.tagText;
    }

    /* renamed from: component2-XSAIIZE, reason: not valid java name and from getter */
    private final long getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: copy-mpE4wyQ$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m18934copympE4wyQ$default(Paragraph paragraph, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paragraph.tagText;
        }
        if ((i & 2) != 0) {
            j = paragraph.lineHeight;
        }
        return paragraph.m18935copympE4wyQ(str, j);
    }

    /* renamed from: copy-mpE4wyQ, reason: not valid java name */
    public final Paragraph m18935copympE4wyQ(String tagText, long lineHeight) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        return new Paragraph(tagText, lineHeight, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Paragraph)) {
            return false;
        }
        Paragraph paragraph = (Paragraph) other;
        return Intrinsics.areEqual(this.tagText, paragraph.tagText) && TextUnit.m8071equalsimpl0(this.lineHeight, paragraph.lineHeight);
    }

    public int hashCode() {
        return (this.tagText.hashCode() * 31) + TextUnit.m8075hashCodeimpl(this.lineHeight);
    }

    public String toString() {
        return "Paragraph(tagText=" + this.tagText + ", lineHeight=" + TextUnit.m8078toStringimpl(this.lineHeight) + ")";
    }

    public /* synthetic */ Paragraph(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "p" : str, (i & 2) != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private Paragraph(String tagText, long j) {
        super(tagText, new ParagraphStyle(0, 0, j, null, null, null, 0, 0, null, 507, null));
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        this.tagText = tagText;
        this.lineHeight = j;
    }
}
