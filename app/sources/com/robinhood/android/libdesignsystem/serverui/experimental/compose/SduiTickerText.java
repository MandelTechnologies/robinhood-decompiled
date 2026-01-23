package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.TickerTextDto;

/* compiled from: SduiTickerText.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"SduiTickerText", "", "component", "Lrh_server_driven_ui/v1/TickerTextDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/TickerTextDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTickerTextKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiTickerText {

    /* compiled from: SduiTickerText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTickerTextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TickerTextDto.CurrencyDto.values().length];
            try {
                iArr[TickerTextDto.CurrencyDto.USD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TickerTextDto.CurrencyDto.SGD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TickerTextDto.CurrencyDto.EUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TickerTextDto.CurrencyDto.GBP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTickerText$lambda$2(TickerTextDto tickerTextDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTickerText(tickerTextDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiTickerText(final TickerTextDto component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BigDecimal bigDecimalOrThrow;
        float animation_duration;
        Object objRememberedValue;
        Composer.Companion companion;
        Animatable animatable;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int i4;
        Currency currency;
        String plainString;
        String suffix;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(238809250);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(238809250, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTickerText (SduiTickerText.kt:22)");
                }
                Locale numberFormatterLocale = CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale();
                BigDecimal bigDecimalOrThrow2 = component.getInitial_value().toBigDecimalOrThrow();
                bigDecimalOrThrow = component.getEnd_value().toBigDecimalOrThrow();
                animation_duration = component.getAnimation_duration();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(bigDecimalOrThrow2.floatValue(), 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(bigDecimalOrThrow) | composerStartRestartGroup.changed(animation_duration);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SduiTickerText2(animatable, bigDecimalOrThrow, animation_duration, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(bigDecimalOrThrow, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                TickerTextDto.CurrencyDto currency_code = component.getCurrency_code();
                i4 = currency_code != null ? -1 : WhenMappings.$EnumSwitchMapping$0[currency_code.ordinal()];
                if (i4 != 1) {
                    currency = Currencies.USD;
                } else if (i4 == 2) {
                    currency = Currencies.SGD;
                } else if (i4 == 3) {
                    currency = Currencies.EUR;
                } else {
                    currency = i4 != 4 ? null : Currencies.GBP;
                }
                if (currency != null) {
                    plainString = new BigDecimal(String.valueOf(((Number) animatable.getValue()).floatValue())).setScale(component.getDecimals_count(), RoundingMode.HALF_UP).toPlainString();
                } else {
                    plainString = Money.format$default(Money3.toMoney(new BigDecimal(String.valueOf(((Number) animatable.getValue()).floatValue())), currency), numberFormatterLocale, false, null, false, component.getDecimals_count(), Integer.valueOf(component.getDecimals_count()), false, RoundingMode.HALF_UP, false, false, 846, null);
                }
                suffix = component.getSuffix();
                if (suffix == null) {
                    suffix = "";
                }
                String str = plainString + suffix;
                ThemedColorDto color = component.getColor();
                composerStartRestartGroup.startReplaceGroup(1862477522);
                Color composeColor = color != null ? SduiColors2.toComposeColor(color, composerStartRestartGroup, 0) : null;
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3 & 112;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str, modifier3, composeColor, null, null, null, TextAlign.m7912boximpl(UtilKt.getComposeTextAlign(component.getText_alignment())), 0, false, 0, 0, null, 0, UtilKt.composeTextStyleWithFont(component.getStyle(), component.getFont(), composerStartRestartGroup, 0), composer2, i6, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTickerTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiTickerText.SduiTickerText$lambda$2(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Locale numberFormatterLocale2 = CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale();
            BigDecimal bigDecimalOrThrow22 = component.getInitial_value().toBigDecimalOrThrow();
            bigDecimalOrThrow = component.getEnd_value().toBigDecimalOrThrow();
            animation_duration = component.getAnimation_duration();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(bigDecimalOrThrow) | composerStartRestartGroup.changed(animation_duration);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new SduiTickerText2(animatable, bigDecimalOrThrow, animation_duration, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(bigDecimalOrThrow, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                TickerTextDto.CurrencyDto currency_code2 = component.getCurrency_code();
                if (currency_code2 != null) {
                }
                if (i4 != 1) {
                }
                if (currency != null) {
                }
                suffix = component.getSuffix();
                if (suffix == null) {
                }
                String str2 = plainString + suffix;
                ThemedColorDto color2 = component.getColor();
                composerStartRestartGroup.startReplaceGroup(1862477522);
                if (color2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i62 = i3 & 112;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, modifier3, composeColor, null, null, null, TextAlign.m7912boximpl(UtilKt.getComposeTextAlign(component.getText_alignment())), 0, false, 0, 0, null, 0, UtilKt.composeTextStyleWithFont(component.getStyle(), component.getFont(), composerStartRestartGroup, 0), composer2, i62, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
