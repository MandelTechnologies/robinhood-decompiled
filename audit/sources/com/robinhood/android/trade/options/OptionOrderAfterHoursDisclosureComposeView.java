package com.robinhood.android.trade.options;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrderAfterHoursDisclosureComposeView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\nJ\r\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderAfterHoursDisclosureComposeView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "disclosureUrl", "Landroidx/compose/runtime/MutableState;", "", "getDisclosureUrl", "()Landroidx/compose/runtime/MutableState;", "bind", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderAfterHoursDisclosureComposeView extends GenericComposeView {
    public static final int $stable = GenericComposeView.$stable;
    private final SnapshotState<Integer> disclosureUrl;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2(OptionOrderAfterHoursDisclosureComposeView optionOrderAfterHoursDisclosureComposeView, int i, Composer composer, int i2) {
        optionOrderAfterHoursDisclosureComposeView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ OptionOrderAfterHoursDisclosureComposeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderAfterHoursDisclosureComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.disclosureUrl = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public final SnapshotState<Integer> getDisclosureUrl() {
        return this.disclosureUrl;
    }

    public final void bind(int disclosureUrl) {
        this.disclosureUrl.setValue(Integer.valueOf(disclosureUrl));
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1368366037);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1368366037, i2, -1, "com.robinhood.android.trade.options.OptionOrderAfterHoursDisclosureComposeView.Content (OptionOrderAfterHoursDisclosureComposeView.kt:25)");
            }
            boolean z = false;
            String strStringResource = StringResources_androidKt.stringResource(C29757R.string.option_order_after_hour_disclosure_text, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C29757R.string.option_order_after_hour_disclosure_inline_link_text, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(this))) {
                z = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderAfterHoursDisclosureComposeView$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOrderAfterHoursDisclosureComposeView.Content$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, function0, null, bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.OptionOrderAfterHoursDisclosureComposeView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderAfterHoursDisclosureComposeView.Content$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1$lambda$0(OptionOrderAfterHoursDisclosureComposeView optionOrderAfterHoursDisclosureComposeView) {
        Context context = optionOrderAfterHoursDisclosureComposeView.getContext();
        Integer value = optionOrderAfterHoursDisclosureComposeView.disclosureUrl.getValue();
        WebUtils.viewUrl$default(context, value != null ? value.intValue() : C29757R.string.option_order_after_hour_disclosure_inline_link_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
