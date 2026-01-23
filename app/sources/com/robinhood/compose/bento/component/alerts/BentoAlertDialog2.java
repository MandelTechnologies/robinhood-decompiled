package com.robinhood.compose.bento.component.alerts;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoAlertDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs;", "", "<init>", "()V", "CornerRadius", "Landroidx/compose/ui/unit/Dp;", "getCornerRadius-D9Ej5fM", "()F", "F", "HorizontalPadding", "getHorizontalPadding-D9Ej5fM", "Body", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertDialogs, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoAlertDialog2 {
    public static final int $stable = 0;
    public static final BentoAlertDialog2 INSTANCE = new BentoAlertDialog2();
    private static final float CornerRadius = C2002Dp.m7995constructorimpl(12);
    private static final float HorizontalPadding = C2002Dp.m7995constructorimpl(16);

    /* compiled from: BentoAlertDialog.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;", "", "<init>", "()V", "Text", "MarkdownText", "Annotated", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body$Annotated;", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body$MarkdownText;", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body$Text;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertDialogs$Body */
    public static abstract class Body {
        public static final int $stable = 0;

        public /* synthetic */ Body(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: BentoAlertDialog.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body$Text;", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertDialogs$Body$Text, reason: from toString */
        public static final /* data */ class Text extends Body {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.text;
                }
                return text.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Text copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Text(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && Intrinsics.areEqual(this.text, ((Text) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Text(text=" + this.text + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }

        private Body() {
        }

        /* compiled from: BentoAlertDialog.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body$MarkdownText;", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;", "markdownText", "", "<init>", "(Ljava/lang/String;)V", "getMarkdownText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertDialogs$Body$MarkdownText, reason: from toString */
        public static final /* data */ class MarkdownText extends Body {
            public static final int $stable = 0;
            private final String markdownText;

            public static /* synthetic */ MarkdownText copy$default(MarkdownText markdownText, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = markdownText.markdownText;
                }
                return markdownText.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMarkdownText() {
                return this.markdownText;
            }

            public final MarkdownText copy(String markdownText) {
                Intrinsics.checkNotNullParameter(markdownText, "markdownText");
                return new MarkdownText(markdownText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarkdownText) && Intrinsics.areEqual(this.markdownText, ((MarkdownText) other).markdownText);
            }

            public int hashCode() {
                return this.markdownText.hashCode();
            }

            public String toString() {
                return "MarkdownText(markdownText=" + this.markdownText + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarkdownText(String markdownText) {
                super(null);
                Intrinsics.checkNotNullParameter(markdownText, "markdownText");
                this.markdownText = markdownText;
            }

            public final String getMarkdownText() {
                return this.markdownText;
            }
        }

        /* compiled from: BentoAlertDialog.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body$Annotated;", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertDialogs$Body;", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlinx/collections/immutable/ImmutableMap;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getInlineContent", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertDialogs$Body$Annotated, reason: from toString */
        public static final /* data */ class Annotated extends Body {
            public static final int $stable = 0;
            private final AnnotatedString annotatedString;
            private final ImmutableMap<String, InlineTextContent> inlineContent;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Annotated copy$default(Annotated annotated, AnnotatedString annotatedString, ImmutableMap immutableMap, int i, Object obj) {
                if ((i & 1) != 0) {
                    annotatedString = annotated.annotatedString;
                }
                if ((i & 2) != 0) {
                    immutableMap = annotated.inlineContent;
                }
                return annotated.copy(annotatedString, immutableMap);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnotatedString getAnnotatedString() {
                return this.annotatedString;
            }

            public final ImmutableMap<String, InlineTextContent> component2() {
                return this.inlineContent;
            }

            public final Annotated copy(AnnotatedString annotatedString, ImmutableMap<String, InlineTextContent> inlineContent) {
                Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
                Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
                return new Annotated(annotatedString, inlineContent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Annotated)) {
                    return false;
                }
                Annotated annotated = (Annotated) other;
                return Intrinsics.areEqual(this.annotatedString, annotated.annotatedString) && Intrinsics.areEqual(this.inlineContent, annotated.inlineContent);
            }

            public int hashCode() {
                return (this.annotatedString.hashCode() * 31) + this.inlineContent.hashCode();
            }

            public String toString() {
                AnnotatedString annotatedString = this.annotatedString;
                return "Annotated(annotatedString=" + ((Object) annotatedString) + ", inlineContent=" + this.inlineContent + ")";
            }

            public final AnnotatedString getAnnotatedString() {
                return this.annotatedString;
            }

            public /* synthetic */ Annotated(AnnotatedString annotatedString, ImmutableMap immutableMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(annotatedString, (i & 2) != 0 ? extensions2.persistentMapOf() : immutableMap);
            }

            public final ImmutableMap<String, InlineTextContent> getInlineContent() {
                return this.inlineContent;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Annotated(AnnotatedString annotatedString, ImmutableMap<String, InlineTextContent> inlineContent) {
                super(null);
                Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
                Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
                this.annotatedString = annotatedString;
                this.inlineContent = inlineContent;
            }
        }
    }

    private BentoAlertDialog2() {
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m20850getCornerRadiusD9Ej5fM() {
        return CornerRadius;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m20851getHorizontalPaddingD9Ej5fM() {
        return HorizontalPadding;
    }
}
