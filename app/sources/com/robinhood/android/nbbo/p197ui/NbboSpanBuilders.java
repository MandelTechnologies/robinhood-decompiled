package com.robinhood.android.nbbo.p197ui;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NbboSpanBuilders.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n¨\u0006\u000b"}, m3636d2 = {"appendNbboOrderSummary", "", "Landroid/text/SpannableStringBuilder;", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "loadingNbbo", "", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "refreshAction", "Lkotlin/Function0;", "feature-lib-nbbo_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.nbbo.ui.NbboSpanBuildersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NbboSpanBuilders {
    public static /* synthetic */ void appendNbboOrderSummary$default(SpannableStringBuilder spannableStringBuilder, NbboSummary nbboSummary, boolean z, Drawable drawable, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.nbbo.ui.NbboSpanBuildersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        appendNbboOrderSummary(spannableStringBuilder, nbboSummary, z, drawable, function0);
    }

    public static final void appendNbboOrderSummary(SpannableStringBuilder spannableStringBuilder, NbboSummary nbboSummary, boolean z, Drawable drawable, final Function0<Unit> refreshAction) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(nbboSummary, "nbboSummary");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(refreshAction, "refreshAction");
        spannableStringBuilder.append(PlaceholderUtils.XXShortPlaceholderText);
        ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
        ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(themeAttributes.getCOLOR_FOREGROUND_2());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) nbboSummary.getNbboPricesCopy());
        spannableStringBuilder.append(PlaceholderUtils.XXShortPlaceholderText);
        spannableStringBuilder.append((CharSequence) nbboSummary.getNbboRefreshCopy());
        spannableStringBuilder.setSpan(themableColorSpans3, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append(PlaceholderUtils.XXShortPlaceholderText);
        if (!z) {
            String nbboRefreshActionCopy = nbboSummary.getNbboRefreshActionCopy();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            List listMutableListOf = CollectionsKt.mutableListOf(new ActionSpan(true, new Function0<Unit>() { // from class: com.robinhood.android.nbbo.ui.NbboSpanBuildersKt$appendNbboOrderSummary$$inlined$buildClickableSpannedString$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    refreshAction.invoke();
                }
            }));
            listMutableListOf.add(new StyleSpan(1));
            Object[] array2 = listMutableListOf.toArray(new Object[0]);
            Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) nbboRefreshActionCopy);
            for (Object obj : objArrCopyOf) {
                spannableStringBuilder2.setSpan(obj, length2, spannableStringBuilder2.length(), 17);
            }
            spannableStringBuilder.append((CharSequence) new SpannedString(spannableStringBuilder2));
        } else {
            ThemableColorSpans3 themableColorSpans32 = new ThemableColorSpans3(themeAttributes.getCOLOR_FOREGROUND_2());
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) nbboSummary.getNbboRefreshActionCopy());
            spannableStringBuilder.setSpan(themableColorSpans32, length3, spannableStringBuilder.length(), 17);
        }
        spannableStringBuilder.append("  ");
        if (z) {
            ImageSpan imageSpan = new ImageSpan(drawable, Build.VERSION.SDK_INT >= 29 ? 2 : 0);
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append(PlaceholderUtils.XXShortPlaceholderText);
            spannableStringBuilder.setSpan(imageSpan, length4, spannableStringBuilder.length(), 17);
        }
    }
}
