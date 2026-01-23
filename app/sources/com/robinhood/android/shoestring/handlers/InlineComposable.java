package com.robinhood.android.shoestring.handlers;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.runtime.Composer;
import com.robinhood.android.shoestring.TagHandler;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InlineComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\rJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/shoestring/handlers/InlineComposable;", "Lcom/robinhood/android/shoestring/TagHandler$Inline;", "", "tagText", "Landroidx/compose/ui/text/Placeholder;", "placeholder", "altText", "Lkotlin/Function1;", "", "composable", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/Placeholder;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/compose/ui/text/Placeholder;", "component3", "component4", "()Lkotlin/jvm/functions/Function3;", "", "", "handlesTagText", "(Ljava/lang/CharSequence;)Z", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "builder", "Lkotlinx/collections/immutable/ImmutableMap;", "Landroidx/compose/foundation/text/InlineTextContent;", "Lcom/robinhood/android/shoestring/InlineContentMap;", "applyInline", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/CharSequence;)Lkotlinx/collections/immutable/ImmutableMap;", "copy", "(Ljava/lang/String;Landroidx/compose/ui/text/Placeholder;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)Lcom/robinhood/android/shoestring/handlers/InlineComposable;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Landroidx/compose/ui/text/Placeholder;", "Lkotlin/jvm/functions/Function3;", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InlineComposable implements TagHandler.Inline {
    public static final int $stable = 0;
    private final String altText;
    private final Function3<String, Composer, Integer, Unit> composable;
    private final Placeholder placeholder;
    private final String tagText;

    /* renamed from: component1, reason: from getter */
    private final String getTagText() {
        return this.tagText;
    }

    /* renamed from: component2, reason: from getter */
    private final Placeholder getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component3, reason: from getter */
    private final String getAltText() {
        return this.altText;
    }

    private final Function3<String, Composer, Integer, Unit> component4() {
        return this.composable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InlineComposable copy$default(InlineComposable inlineComposable, String str, Placeholder placeholder, String str2, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inlineComposable.tagText;
        }
        if ((i & 2) != 0) {
            placeholder = inlineComposable.placeholder;
        }
        if ((i & 4) != 0) {
            str2 = inlineComposable.altText;
        }
        if ((i & 8) != 0) {
            function3 = inlineComposable.composable;
        }
        return inlineComposable.copy(str, placeholder, str2, function3);
    }

    public final InlineComposable copy(String tagText, Placeholder placeholder, String altText, Function3<? super String, ? super Composer, ? super Integer, Unit> composable) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(altText, "altText");
        Intrinsics.checkNotNullParameter(composable, "composable");
        return new InlineComposable(tagText, placeholder, altText, composable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineComposable)) {
            return false;
        }
        InlineComposable inlineComposable = (InlineComposable) other;
        return Intrinsics.areEqual(this.tagText, inlineComposable.tagText) && Intrinsics.areEqual(this.placeholder, inlineComposable.placeholder) && Intrinsics.areEqual(this.altText, inlineComposable.altText) && Intrinsics.areEqual(this.composable, inlineComposable.composable);
    }

    public int hashCode() {
        return (((((this.tagText.hashCode() * 31) + this.placeholder.hashCode()) * 31) + this.altText.hashCode()) * 31) + this.composable.hashCode();
    }

    public String toString() {
        return "InlineComposable(tagText=" + this.tagText + ", placeholder=" + this.placeholder + ", altText=" + this.altText + ", composable=" + this.composable + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InlineComposable(String tagText, Placeholder placeholder, String altText, Function3<? super String, ? super Composer, ? super Integer, Unit> composable) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(altText, "altText");
        Intrinsics.checkNotNullParameter(composable, "composable");
        this.tagText = tagText;
        this.placeholder = placeholder;
        this.altText = altText;
        this.composable = composable;
    }

    public /* synthetic */ InlineComposable(String str, Placeholder placeholder, String str2, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, placeholder, (i & 4) != 0 ? str : str2, function3);
    }

    @Override // com.robinhood.android.shoestring.TagHandler.Inline
    public boolean handlesTagText(CharSequence tagText) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        return Intrinsics.areEqual(tagText, this.tagText);
    }

    @Override // com.robinhood.android.shoestring.TagHandler.Inline
    public ImmutableMap<String, InlineTextContent> applyInline(AnnotatedString.Builder builder, CharSequence tagText) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        String str = ((Object) tagText) + "_" + builder.getLength();
        InlineTextContent2.appendInlineContent(builder, str, this.altText);
        return extensions2.persistentMapOf(Tuples4.m3642to(str, new InlineTextContent(this.placeholder, this.composable)));
    }
}
