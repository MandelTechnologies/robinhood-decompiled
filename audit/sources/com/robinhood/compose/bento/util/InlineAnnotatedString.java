package com.robinhood.compose.bento.util;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InlineAnnotatedString.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/bento/util/InlineAnnotatedString;", "", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlinx/collections/immutable/ImmutableMap;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getInlineContent", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InlineAnnotatedString {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final ImmutableMap<String, InlineTextContent> inlineContent;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InlineAnnotatedString copy$default(InlineAnnotatedString inlineAnnotatedString, AnnotatedString annotatedString, ImmutableMap immutableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = inlineAnnotatedString.annotatedString;
        }
        if ((i & 2) != 0) {
            immutableMap = inlineAnnotatedString.inlineContent;
        }
        return inlineAnnotatedString.copy(annotatedString, immutableMap);
    }

    /* renamed from: component1, reason: from getter */
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final ImmutableMap<String, InlineTextContent> component2() {
        return this.inlineContent;
    }

    public final InlineAnnotatedString copy(AnnotatedString annotatedString, ImmutableMap<String, InlineTextContent> inlineContent) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
        return new InlineAnnotatedString(annotatedString, inlineContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineAnnotatedString)) {
            return false;
        }
        InlineAnnotatedString inlineAnnotatedString = (InlineAnnotatedString) other;
        return Intrinsics.areEqual(this.annotatedString, inlineAnnotatedString.annotatedString) && Intrinsics.areEqual(this.inlineContent, inlineAnnotatedString.inlineContent);
    }

    public int hashCode() {
        return (this.annotatedString.hashCode() * 31) + this.inlineContent.hashCode();
    }

    public String toString() {
        AnnotatedString annotatedString = this.annotatedString;
        return "InlineAnnotatedString(annotatedString=" + ((Object) annotatedString) + ", inlineContent=" + this.inlineContent + ")";
    }

    public InlineAnnotatedString(AnnotatedString annotatedString, ImmutableMap<String, InlineTextContent> inlineContent) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
        this.annotatedString = annotatedString;
        this.inlineContent = inlineContent;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public /* synthetic */ InlineAnnotatedString(AnnotatedString annotatedString, ImmutableMap immutableMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i & 2) != 0 ? extensions2.persistentMapOf() : immutableMap);
    }

    public final ImmutableMap<String, InlineTextContent> getInlineContent() {
        return this.inlineContent;
    }
}
