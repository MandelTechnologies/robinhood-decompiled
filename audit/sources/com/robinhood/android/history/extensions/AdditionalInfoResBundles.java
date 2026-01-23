package com.robinhood.android.history.extensions;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.plaid.internal.EnumC7081g;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections._Collections3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: AdditionalInfoResBundles.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a*\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u00050\b2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m3636d2 = {"toString", "", "Lkotlin/Pair;", "", "", "Lcom/robinhood/android/history/ui/model/ResBundle;", "resources", "Landroid/content/res/Resources;", "", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.extensions.AdditionalInfoResBundlesKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AdditionalInfoResBundles {
    public static final CharSequence toString(Tuples2<Integer, String> tuples2, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(tuples2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (tuples2.getSecond() != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(resources.getText(tuples2.getFirst().intValue()).toString(), Arrays.copyOf(new Object[]{tuples2.getSecond()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        CharSequence text = resources.getText(tuples2.getFirst().intValue());
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    public static final CharSequence toString(List<Tuples2<Integer, String>> list, final Resources resources) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return (CharSequence) _Collections3.joinTo(list, new SpannableStringBuilder(), (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 2) != 0 ? ", " : "\n\n", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 4) != 0 ? "" : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 8) == 0 ? null : "", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 16) != 0 ? -1 : 0, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 32) != 0 ? "..." : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 64) != 0 ? null : new Function1() { // from class: com.robinhood.android.history.extensions.AdditionalInfoResBundlesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdditionalInfoResBundles.toString$lambda$1(resources, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1(Resources resources, Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return toString((Tuples2<Integer, String>) it, resources);
    }
}
