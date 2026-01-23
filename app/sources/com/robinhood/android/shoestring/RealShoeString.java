package com.robinhood.android.shoestring;

import android.content.res.Resources;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.utils.resource.StringResource;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: ShoeString.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J'\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR7\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u0002`\u00160\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/shoestring/RealShoeString;", "Lcom/robinhood/android/shoestring/ShoeString;", "resources", "Landroid/content/res/Resources;", "taterTemplate", "Lcom/robinhood/utils/resource/StringResource;", "tagHandlers", "Lcom/robinhood/android/shoestring/TagHandlers;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/shoestring/TagHandlers;)V", "getResources", "()Landroid/content/res/Resources;", "getTaterTemplate", "()Lcom/robinhood/utils/resource/StringResource;", "getTagHandlers", "()Lcom/robinhood/android/shoestring/TagHandlers;", "result", "Lkotlin/Pair;", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Lcom/robinhood/android/shoestring/InlineContentMap;", "getResult", "()Lkotlin/Pair;", "result$delegate", "Lkotlin/Lazy;", "annotatedString", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "getInlineContent", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RealShoeString implements ShoeString {
    public static final int $stable = 8;
    private final Resources resources;

    /* renamed from: result$delegate, reason: from kotlin metadata */
    private final Lazy result;
    private final TagHandlers tagHandlers;
    private final StringResource taterTemplate;

    public static /* synthetic */ RealShoeString copy$default(RealShoeString realShoeString, Resources resources, StringResource stringResource, TagHandlers tagHandlers, int i, Object obj) {
        if ((i & 1) != 0) {
            resources = realShoeString.resources;
        }
        if ((i & 2) != 0) {
            stringResource = realShoeString.taterTemplate;
        }
        if ((i & 4) != 0) {
            tagHandlers = realShoeString.tagHandlers;
        }
        return realShoeString.copy(resources, stringResource, tagHandlers);
    }

    /* renamed from: component1, reason: from getter */
    public final Resources getResources() {
        return this.resources;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTaterTemplate() {
        return this.taterTemplate;
    }

    /* renamed from: component3, reason: from getter */
    public final TagHandlers getTagHandlers() {
        return this.tagHandlers;
    }

    public final RealShoeString copy(Resources resources, StringResource taterTemplate, TagHandlers tagHandlers) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(taterTemplate, "taterTemplate");
        Intrinsics.checkNotNullParameter(tagHandlers, "tagHandlers");
        return new RealShoeString(resources, taterTemplate, tagHandlers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealShoeString)) {
            return false;
        }
        RealShoeString realShoeString = (RealShoeString) other;
        return Intrinsics.areEqual(this.resources, realShoeString.resources) && Intrinsics.areEqual(this.taterTemplate, realShoeString.taterTemplate) && Intrinsics.areEqual(this.tagHandlers, realShoeString.tagHandlers);
    }

    public int hashCode() {
        return (((this.resources.hashCode() * 31) + this.taterTemplate.hashCode()) * 31) + this.tagHandlers.hashCode();
    }

    public String toString() {
        return "RealShoeString(resources=" + this.resources + ", taterTemplate=" + this.taterTemplate + ", tagHandlers=" + this.tagHandlers + ")";
    }

    public RealShoeString(Resources resources, StringResource taterTemplate, TagHandlers tagHandlers) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(taterTemplate, "taterTemplate");
        Intrinsics.checkNotNullParameter(tagHandlers, "tagHandlers");
        this.resources = resources;
        this.taterTemplate = taterTemplate;
        this.tagHandlers = tagHandlers;
        this.result = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.shoestring.RealShoeString$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealShoeString.result_delegate$lambda$0(this.f$0);
            }
        });
    }

    public final Resources getResources() {
        return this.resources;
    }

    public final StringResource getTaterTemplate() {
        return this.taterTemplate;
    }

    public final TagHandlers getTagHandlers() {
        return this.tagHandlers;
    }

    private final Tuples2<AnnotatedString, ImmutableMap<String, InlineTextContent>> getResult() {
        return (Tuples2) this.result.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 result_delegate$lambda$0(RealShoeString realShoeString) {
        return ShoeStringifier.INSTANCE.parse(realShoeString.taterTemplate.getText(realShoeString.resources), realShoeString.tagHandlers);
    }

    @Override // com.robinhood.android.shoestring.ShoeString
    public AnnotatedString getAnnotatedString() {
        return getResult().getFirst();
    }

    @Override // com.robinhood.android.shoestring.ShoeString
    public ImmutableMap<String, InlineTextContent> getInlineContent() {
        return getResult().getSecond();
    }
}
