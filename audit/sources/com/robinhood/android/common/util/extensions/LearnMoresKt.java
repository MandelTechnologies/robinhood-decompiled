package com.robinhood.android.common.util.extensions;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LearnMores.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000\u001aK\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012\u001aJ\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m3636d2 = {"buildTextWithLearnMore", "", "Landroid/content/res/Resources;", "mainStrRes", "", "bold", "", "underline", "learnMoreRes", "learnMore", "Lkotlin/Function0;", "", "(Landroid/content/res/Resources;IZZLjava/lang/Integer;Lkotlin/jvm/functions/Function0;)Ljava/lang/CharSequence;", "mainStr", "learnMoreStr", ResourceTypes.COLOR, "clickableSpan", "Landroid/text/style/ClickableSpan;", "(Landroid/content/res/Resources;Ljava/lang/CharSequence;ZLjava/lang/Integer;ZLjava/lang/CharSequence;Landroid/text/style/ClickableSpan;)Ljava/lang/CharSequence;", "buildTextWithLearnMoreAndSuffix", "Landroid/text/SpannedString;", "suffixRes", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LearnMoresKt {
    public static /* synthetic */ CharSequence buildTextWithLearnMore$default(Resources resources, int i, boolean z, boolean z2, Integer num, Function0 learnMore, int i2, Object obj) throws Resources.NotFoundException {
        boolean z3 = false;
        boolean z4 = (i2 & 2) != 0 ? false : z;
        boolean z5 = (i2 & 4) != 0 ? false : z2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Integer num2 = (i2 & 8) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        CharSequence text = resources.getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return buildTextWithLearnMore$default(resources, text, z4, null, z5, num2 != null ? resources.getText(num2.intValue()) : null, new ActionSpan(z3, new C118722(learnMore), 1, defaultConstructorMarker), 4, null);
    }

    public static final CharSequence buildTextWithLearnMore(Resources resources, int i, boolean z, boolean z2, Integer num, Function0<Unit> learnMore) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        CharSequence text = resources.getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return buildTextWithLearnMore$default(resources, text, z, null, z2, num != null ? resources.getText(num.intValue()) : null, new ActionSpan(false, (Function0) new C118722(learnMore), 1, (DefaultConstructorMarker) null), 4, null);
    }

    public static final SpannedString buildTextWithLearnMoreAndSuffix(Resources resources, int i, int i2, int i3, boolean z, boolean z2, Function0<Unit> learnMore) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        CharSequence text = resources.getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        CharSequence charSequenceBuildTextWithLearnMore$default = buildTextWithLearnMore$default(resources, text, z, null, z2, resources.getText(i2), new ActionSpan(false, (Function0) new C118722(learnMore), 1, (DefaultConstructorMarker) null), 4, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequenceBuildTextWithLearnMore$default);
        spannableStringBuilder.append((CharSequence) resources.getString(i3));
        return new SpannedString(spannableStringBuilder);
    }

    public static /* synthetic */ CharSequence buildTextWithLearnMore$default(Resources resources, CharSequence mainStr, boolean z, boolean z2, CharSequence charSequence, Function0 learnMore, int i, Object obj) {
        boolean z3 = false;
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CharSequence charSequence2 = (i & 8) != 0 ? null : charSequence;
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        return buildTextWithLearnMore$default(resources, mainStr, z4, null, z5, charSequence2, new ActionSpan(z3, new C118722(learnMore), 1, defaultConstructorMarker), 4, null);
    }

    /* compiled from: LearnMores.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.android.common.util.extensions.LearnMoresKt$buildTextWithLearnMore$2 */
    public static final class C118722 implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $learnMore;

        public C118722(Function0<Unit> function0) {
            this.$learnMore = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$learnMore.invoke();
        }
    }

    public static final CharSequence buildTextWithLearnMore(Resources resources, CharSequence mainStr, boolean z, Integer num, boolean z2, CharSequence charSequence, ClickableSpan clickableSpan) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(clickableSpan, "clickableSpan");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(mainStr);
        spannableStringBuilder.append(' ');
        List listMutableListOf = CollectionsKt.mutableListOf(clickableSpan);
        if (z) {
            listMutableListOf.add(new StyleSpan(1));
        }
        if (z2) {
            listMutableListOf.add(new UnderlineSpan());
        }
        if (num != null) {
            listMutableListOf.add(new ForegroundColorSpan(num.intValue()));
        }
        Object[] array2 = listMutableListOf.toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
        int length = spannableStringBuilder.length();
        if (charSequence == null) {
            charSequence = resources.getString(C11048R.string.general_action_learn_more);
            Intrinsics.checkNotNullExpressionValue(charSequence, "getString(...)");
        }
        spannableStringBuilder.append(charSequence);
        for (Object obj : objArrCopyOf) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }

    public static final CharSequence buildTextWithLearnMore(Resources resources, CharSequence mainStr, boolean z, boolean z2, CharSequence charSequence, Function0<Unit> learnMore) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(mainStr, "mainStr");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        return buildTextWithLearnMore$default(resources, mainStr, z, null, z2, charSequence, new ActionSpan(false, (Function0) new C118722(learnMore), 1, (DefaultConstructorMarker) null), 4, null);
    }

    public static /* synthetic */ CharSequence buildTextWithLearnMore$default(Resources resources, CharSequence charSequence, boolean z, Integer num, boolean z2, CharSequence charSequence2, ClickableSpan clickableSpan, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            charSequence2 = null;
        }
        return buildTextWithLearnMore(resources, charSequence, z, num, z2, charSequence2, clickableSpan);
    }

    public static /* synthetic */ SpannedString buildTextWithLearnMoreAndSuffix$default(Resources resources, int i, int i2, int i3, boolean z, boolean z2, Function0 function0, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z = false;
        }
        if ((i4 & 16) != 0) {
            z2 = false;
        }
        return buildTextWithLearnMoreAndSuffix(resources, i, i2, i3, z, z2, function0);
    }
}
