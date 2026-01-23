package com.robinhood.android.common.util;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisclosureUtil.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011JB\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/util/DisclosureUtil;", "", "<init>", "()V", "getDisclosure", "", "context", "Landroid/content/Context;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Landroid/text/SpannableString;", "appendToggleText", "", "expanded", "expandedToggleText", "", "collapsedToggleText", "toggleAction", "Lkotlin/Function0;", "", "appendExpandCollapseDisclosureAttribute", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DisclosureUtil {
    public static final int $stable = 0;
    public static final DisclosureUtil INSTANCE = new DisclosureUtil();

    private DisclosureUtil() {
    }

    public static /* synthetic */ CharSequence getDisclosure$default(DisclosureUtil disclosureUtil, Context context, SpannableString spannableString, boolean z, boolean z2, String str, String str2, Function0 function0, int i, Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        return disclosureUtil.getDisclosure(context, spannableString, z, z2, str, str2, function0);
    }

    public final CharSequence getDisclosure(Context context, SpannableString disclosure, boolean appendToggleText, boolean expanded, String expandedToggleText, String collapsedToggleText, Function0<Unit> toggleAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(toggleAction, "toggleAction");
        return appendToggleText ? appendExpandCollapseDisclosureAttribute(context, disclosure, expanded, expandedToggleText, collapsedToggleText, toggleAction) : disclosure;
    }

    private final CharSequence appendExpandCollapseDisclosureAttribute(Context context, SpannableString disclosure, boolean expanded, String expandedToggleText, String collapsedToggleText, final Function0<Unit> toggleAction) {
        if (expandedToggleText == null) {
            expandedToggleText = context.getString(C11048R.string.disclosure_show_less);
            Intrinsics.checkNotNullExpressionValue(expandedToggleText, "getString(...)");
        }
        if (collapsedToggleText == null) {
            collapsedToggleText = context.getString(C11048R.string.disclosure_show_more);
            Intrinsics.checkNotNullExpressionValue(collapsedToggleText, "getString(...)");
        }
        if (!expanded) {
            expandedToggleText = collapsedToggleText;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) disclosure);
        Object[] objArr = {new CustomTypefaceSpan(RhTypeface.BOLD.load(context)), new ActionSpan(false, new Function0() { // from class: com.robinhood.android.common.util.DisclosureUtil$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DisclosureUtil.appendExpandCollapseDisclosureAttribute$lambda$2$lambda$0(toggleAction);
            }
        }, 1, (DefaultConstructorMarker) null)};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) expandedToggleText);
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appendExpandCollapseDisclosureAttribute$lambda$2$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
