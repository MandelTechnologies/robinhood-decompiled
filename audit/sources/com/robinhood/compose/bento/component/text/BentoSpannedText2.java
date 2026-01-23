package com.robinhood.compose.bento.component.text;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoSpannedText.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/DefaultSpannedTextProvider;", "Lcom/robinhood/compose/bento/component/text/SpannedTextProvider;", "<init>", "()V", "SpannedText", "", "spanned", "Landroid/text/Spanned;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "textAppearance", "", "gravity", "maxLines", "autoSizeTextType", "onClick", "Lkotlin/Function0;", "SpannedText-gPmlwdY", "(Landroid/text/Spanned;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ILjava/lang/Integer;IILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.DefaultSpannedTextProvider, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoSpannedText2 implements BentoSpannedText4 {
    public static final int $stable = 0;
    public static final BentoSpannedText2 INSTANCE = new BentoSpannedText2();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpannedText_gPmlwdY$lambda$6(BentoSpannedText2 bentoSpannedText2, Spanned spanned, Modifier modifier, Color color, Color color2, int i, Integer num, int i2, int i3, Function0 function0, int i4, Composer composer, int i5) {
        bentoSpannedText2.mo13684SpannedTextgPmlwdY(spanned, modifier, color, color2, i, num, i2, i3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1));
        return Unit.INSTANCE;
    }

    private BentoSpannedText2() {
    }

    @Override // com.robinhood.compose.bento.component.text.BentoSpannedText4
    /* renamed from: SpannedText-gPmlwdY */
    public void mo13684SpannedTextgPmlwdY(final Spanned spanned, final Modifier modifier, final Color color, final Color color2, final int i, final Integer num, final int i2, final int i3, final Function0<Unit> function0, Composer composer, final int i4) {
        int i5;
        int i6;
        Integer num2;
        int i7;
        Composer composer2;
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1986557223);
        if ((i4 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(spanned) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(color) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(color2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 = i;
            i5 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
        } else {
            i6 = i;
        }
        if ((196608 & i4) == 0) {
            num2 = num;
            i5 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
        } else {
            num2 = num;
        }
        if ((1572864 & i4) == 0) {
            i7 = i2;
            i5 |= composerStartRestartGroup.changed(i7) ? 1048576 : 524288;
        } else {
            i7 = i2;
        }
        if ((i4 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
        }
        if ((i5 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1986557223, i5, -1, "com.robinhood.compose.bento.component.text.DefaultSpannedTextProvider.SpannedText (BentoSpannedText.kt:95)");
            }
            final int iM6735toArgb8_81llA = Color2.m6735toArgb8_81llA(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU());
            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.text.DefaultSpannedTextProvider$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoSpannedText2.SpannedText_gPmlwdY$lambda$1$lambda$0((Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(spanned) | ((i5 & 57344) == 16384) | ((458752 & i5) == 131072) | ((234881024 & i5) == 67108864) | ((i5 & 896) == 256) | composerStartRestartGroup.changed(iM6735toArgb8_81llA) | ((i5 & 7168) == 2048) | ((3670016 & i5) == 1048576) | ((29360128 & i5) == 8388608);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                final int i8 = i6;
                final Integer num3 = num2;
                final int i9 = i7;
                Function1 function12 = new Function1() { // from class: com.robinhood.compose.bento.component.text.DefaultSpannedTextProvider$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoSpannedText2.SpannedText_gPmlwdY$lambda$5$lambda$4(spanned, i8, num3, function0, color, iM6735toArgb8_81llA, color2, i9, i3, (RhTextView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue2 = function12;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            AndroidView_androidKt.AndroidView(function1, modifierWithBentoPlaceholder$default, (Function1) objRememberedValue2, composer2, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.DefaultSpannedTextProvider$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSpannedText2.SpannedText_gPmlwdY$lambda$6(this.f$0, spanned, modifier, color, color2, i, num, i2, i3, function0, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhTextView SpannedText_gPmlwdY$lambda$1$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new RhTextView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpannedText_gPmlwdY$lambda$5$lambda$4(Spanned spanned, int i, Integer num, Function0 function0, Color color, int i2, Color color2, int i3, int i4, RhTextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText(spanned);
        TextViewsKt.setTextAppearanceAttr(view, i);
        if (num != null) {
            view.setGravity(num.intValue());
        }
        if (function0 != null) {
            OnClickListeners.onClick(view, function0);
        }
        if (i == C20690R.attr.textAppearanceDisplayLarge) {
            ViewCompat.setAccessibilityHeading(view, true);
            view.setFocusable(true);
        }
        if (color != null) {
            i2 = Color2.m6735toArgb8_81llA(color.getValue());
        }
        view.setTextColor(i2);
        if (color2 != null) {
            view.setLinkTextColor(Color2.m6735toArgb8_81llA(color2.getValue()));
        }
        view.setMaxLines(i3);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(view, i4);
        return Unit.INSTANCE;
    }
}
