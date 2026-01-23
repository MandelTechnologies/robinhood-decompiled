package com.robinhood.shared.ticker;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextPainter2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.shared.ticker.config.TickerLocaleConfig;
import com.robinhood.shared.ticker.internal.ColumnDataBuilder;
import com.robinhood.shared.ticker.internal.ColumnDataResult;
import com.robinhood.shared.ticker.internal.SeparatorRenderInfo;
import com.robinhood.shared.ticker.internal.TickerColumnSnapshot;
import com.robinhood.shared.ticker.internal.TickerTextAnimationState;
import com.robinhood.shared.ticker.internal.TickerTextAnimationState3;
import com.robinhood.shared.ticker.internal.TickerTextAutoSize;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TickerText.kt */
@Metadata(m3635d1 = {"\u0000{\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b*\u0001*\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001ak\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a4\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00160\"2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u001a\r\u0010.\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010/\u001a\r\u00100\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010/\u001a\r\u00101\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010/\"\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030'X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030'X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+\"\u000e\u0010,\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000¨\u00062²\u0006\n\u00103\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u008e\u0002"}, m3636d2 = {"TickerText", "", "text", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "localeConfig", "Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;", "containerModifier", "Landroidx/compose/ui/Modifier;", "tickerModifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ExtensionFunctionType;", "contentDescription", "textType", "Lcom/robinhood/shared/ticker/TextType;", "autoSize", "", "minScaleFactor", "", "startPadding", "Landroidx/compose/ui/unit/Dp;", "endPadding", "TickerText-5WbBtfw", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/robinhood/shared/ticker/TextType;ZFFFLandroidx/compose/runtime/Composer;III)V", "TickerTextContent", "maxWidthPx", "modifier", "TickerTextContent-iwasAgA", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;Ljava/lang/String;Lcom/robinhood/shared/ticker/TextType;Ljava/lang/Float;FFFLcom/robinhood/shared/ticker/config/TickerLocaleConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "buildCharWidthCache", "", "", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "PREVIEW_VALUES", "", "PREVIEW_CRYPTO_VALUES", "PREVIEW_CONFIG", "com/robinhood/shared/ticker/TickerTextKt$PREVIEW_CONFIG$1", "Lcom/robinhood/shared/ticker/TickerTextKt$PREVIEW_CONFIG$1;", "PREVIEW_CYCLE_DELAY_MS", "", "TickerTextAnimatedPreview", "(Landroidx/compose/runtime/Composer;I)V", "TickerTextMoneyTypePreview", "TickerTextStaticPreview", "lib-ticker-compose_externalDebug", "valueIndex", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TickerTextKt {
    private static final long PREVIEW_CYCLE_DELAY_MS = 500;
    private static final List<String> PREVIEW_VALUES = CollectionsKt.listOf((Object[]) new String[]{"$1.23", "$4.56", "$14.56"});
    private static final List<String> PREVIEW_CRYPTO_VALUES = CollectionsKt.listOf((Object[]) new String[]{"1.55 XRP", "2.34 XRP", "12.34 XRP"});
    private static final TickerTextKt$PREVIEW_CONFIG$1 PREVIEW_CONFIG = new TickerLocaleConfig() { // from class: com.robinhood.shared.ticker.TickerTextKt$PREVIEW_CONFIG$1
        private final char groupingSeparator = ',';
        private final char decimalSeparator = '.';
        private final char monetaryDecimalSeparator = '.';
        private final char monetaryGroupingSeparator = ',';
        private final char percentSymbol = TickerInputView.PERCENT_SYMBOL;

        @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
        public Set<Character> getMoneyCharacters() {
            return TickerLocaleConfig.DefaultImpls.getMoneyCharacters(this);
        }

        @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
        public char getGroupingSeparator() {
            return this.groupingSeparator;
        }

        @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
        public char getDecimalSeparator() {
            return this.decimalSeparator;
        }

        @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
        public char getMonetaryDecimalSeparator() {
            return this.monetaryDecimalSeparator;
        }

        @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
        public char getMonetaryGroupingSeparator() {
            return this.monetaryGroupingSeparator;
        }

        @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
        public char getPercentSymbol() {
            return this.percentSymbol;
        }
    };

    /* compiled from: TickerText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextType.values().length];
            try {
                iArr[TextType.MONEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerTextAnimatedPreview$lambda$27(int i, Composer composer, int i2) {
        TickerTextAnimatedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerTextContent_iwasAgA$lambda$21(String str, long j, TextStyle textStyle, String str2, TextType textType, Float f, float f2, float f3, float f4, TickerLocaleConfig tickerLocaleConfig, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m25794TickerTextContentiwasAgA(str, j, textStyle, str2, textType, f, f2, f3, f4, tickerLocaleConfig, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerTextMoneyTypePreview$lambda$32(int i, Composer composer, int i2) {
        TickerTextMoneyTypePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerTextStaticPreview$lambda$33(int i, Composer composer, int i2) {
        TickerTextStaticPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerText_5WbBtfw$lambda$3(String str, long j, TextStyle textStyle, TickerLocaleConfig tickerLocaleConfig, Modifier modifier, Function1 function1, String str2, TextType textType, boolean z, float f, float f2, float f3, int i, int i2, int i3, Composer composer, int i4) {
        m25793TickerText5WbBtfw(str, j, textStyle, tickerLocaleConfig, modifier, function1, str2, textType, z, f, f2, f3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Companion TickerText_5WbBtfw$lambda$1$lambda$0(BoxScope boxScope) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        return Modifier.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* renamed from: TickerText-5WbBtfw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25793TickerText5WbBtfw(final String text, final long j, final TextStyle style, final TickerLocaleConfig localeConfig, Modifier modifier, Function1<? super BoxScope, ? extends Modifier> function1, String str, TextType textType, boolean z, float f, float f2, float f3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Function1<? super BoxScope, ? extends Modifier> function12;
        int i17;
        final String str3;
        final TextType textType2;
        int i18;
        final float f4;
        final float f5;
        final Function1<? super BoxScope, ? extends Modifier> function13;
        boolean z2;
        Modifier modifier3;
        final float fM7995constructorimpl;
        String str4;
        TextType textType3;
        float f6;
        Function1<? super BoxScope, ? extends Modifier> function14;
        Modifier modifier4;
        Composer composer2;
        final float f7;
        final float f8;
        final boolean z3;
        final Modifier modifier5;
        final float f9;
        final Function1<? super BoxScope, ? extends Modifier> function15;
        final String str5;
        final TextType textType4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2111370266);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(style) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(localeConfig) : composerStartRestartGroup.changedInstance(localeConfig) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    str2 = str;
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(str2)) ? 1048576 : 524288;
                } else {
                    str2 = str;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(textType == null ? -1 : textType.ordinal()) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                        if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
                        }
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (composerStartRestartGroup.changed(f2) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i14 |= 48;
                            i16 = i15;
                        } else if ((i2 & 48) == 0) {
                            i16 = i15;
                            i14 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
                        } else {
                            i16 = i15;
                        }
                        int i19 = i14;
                        int i20 = i4;
                        if ((i4 & 306783379) != 306783378 || (i19 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier6 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return TickerTextKt.TickerText_5WbBtfw$lambda$1$lambda$0((BoxScope) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    function12 = (Function1) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function12 = function1;
                                }
                                if ((i3 & 64) == 0) {
                                    i17 = i20 & (-3670017);
                                    str2 = text;
                                } else {
                                    i17 = i20;
                                }
                                TextType textType5 = i7 == 0 ? TextType.DEFAULT : textType;
                                boolean z4 = i9 == 0 ? false : z;
                                float f10 = i11 == 0 ? 0.5f : f;
                                float fM7995constructorimpl2 = i13 == 0 ? C2002Dp.m7995constructorimpl(0) : f2;
                                Modifier modifier7 = modifier6;
                                if (i16 == 0) {
                                    Function1<? super BoxScope, ? extends Modifier> function16 = function12;
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                    i18 = i17;
                                    function13 = function16;
                                    str3 = str2;
                                    textType2 = textType5;
                                    f4 = f10;
                                    f5 = fM7995constructorimpl2;
                                    z2 = z4;
                                    modifier3 = modifier7;
                                } else {
                                    str3 = str2;
                                    textType2 = textType5;
                                    i18 = i17;
                                    f4 = f10;
                                    f5 = fM7995constructorimpl2;
                                    function13 = function12;
                                    z2 = z4;
                                    modifier3 = modifier7;
                                    fM7995constructorimpl = f3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i18 = i20 & (-3670017);
                                    textType2 = textType;
                                    z2 = z;
                                    f5 = f2;
                                    fM7995constructorimpl = f3;
                                } else {
                                    textType2 = textType;
                                    z2 = z;
                                    f5 = f2;
                                    fM7995constructorimpl = f3;
                                    i18 = i20;
                                }
                                str3 = str2;
                                modifier3 = modifier2;
                                function13 = function1;
                                f4 = f;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2111370266, i18, i19, "com.robinhood.shared.ticker.TickerText (TickerText.kt:72)");
                            }
                            if (!z2) {
                                composerStartRestartGroup.startReplaceGroup(-35070711);
                                Function3<BoxWithConstraints4, Composer, Integer, Unit> function3 = new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.ticker.TickerTextKt$TickerText$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                                        invoke(boxWithConstraints4, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer3, int i21) {
                                        int i22;
                                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                        if ((i21 & 6) == 0) {
                                            i22 = i21 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                        } else {
                                            i22 = i21;
                                        }
                                        if ((i22 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(955301079, i22, -1, "com.robinhood.shared.ticker.TickerText.<anonymous> (TickerText.kt:75)");
                                        }
                                        TickerTextKt.m25794TickerTextContentiwasAgA(text, j, style, str3, textType2, Constraints.m7971getHasBoundedWidthimpl(BoxWithConstraints.getConstraints()) ? Float.valueOf(Constraints.m7975getMaxWidthimpl(r2)) : null, f4, f5, fM7995constructorimpl, localeConfig, function13.invoke(BoxWithConstraints), composer3, 0, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                };
                                str4 = str3;
                                textType3 = textType2;
                                f6 = f4;
                                Modifier modifier8 = modifier3;
                                BoxWithConstraints.BoxWithConstraints(modifier8, null, false, ComposableLambda3.rememberComposableLambda(955301079, true, function3, composerStartRestartGroup, 54), composerStartRestartGroup, ((i18 >> 12) & 14) | 3072, 6);
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceGroup();
                                function14 = function13;
                                modifier4 = modifier8;
                            } else {
                                int i21 = i18;
                                str4 = str3;
                                textType3 = textType2;
                                f6 = f4;
                                Function1<? super BoxScope, ? extends Modifier> function17 = function13;
                                Modifier modifier9 = modifier3;
                                composerStartRestartGroup.startReplaceGroup(-34287279);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier9);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                int i22 = i21 >> 9;
                                int i23 = (i21 & 14) | 1769472 | (i21 & 112) | (i21 & 896) | (i22 & 7168) | (i22 & 57344);
                                int i24 = i19 << 21;
                                function14 = function17;
                                modifier4 = modifier9;
                                m25794TickerTextContentiwasAgA(text, j, style, str4, textType3, null, 1.0f, f5, fM7995constructorimpl, localeConfig, function17.invoke(BoxScopeInstance.INSTANCE), composerStartRestartGroup, i23 | (29360128 & i24) | (i24 & 234881024) | (1879048192 & (i21 << 18)), 0, 0);
                                composer2 = composerStartRestartGroup;
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f7 = f5;
                            f8 = fM7995constructorimpl;
                            z3 = z2;
                            modifier5 = modifier4;
                            f9 = f6;
                            function15 = function14;
                            str5 = str4;
                            textType4 = textType3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            textType4 = textType;
                            z3 = z;
                            f7 = f2;
                            f8 = f3;
                            str5 = str2;
                            modifier5 = modifier2;
                            composer2 = composerStartRestartGroup;
                            function15 = function1;
                            f9 = f;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TickerTextKt.TickerText_5WbBtfw$lambda$3(text, j, style, localeConfig, modifier5, function15, str5, textType4, z3, f9, f7, f8, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    int i192 = i14;
                    int i202 = i4;
                    if ((i4 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            Modifier modifier72 = modifier6;
                            if (i16 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (!z2) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f7 = f5;
                            f8 = fM7995constructorimpl;
                            z3 = z2;
                            modifier5 = modifier4;
                            f9 = f6;
                            function15 = function14;
                            str5 = str4;
                            textType4 = textType3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                int i1922 = i14;
                int i2022 = i4;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            int i19222 = i14;
            int i20222 = i4;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        int i192222 = i14;
        int i202222 = i4;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0104  */
    /* renamed from: TickerTextContent-iwasAgA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25794TickerTextContentiwasAgA(final String str, final long j, final TextStyle textStyle, final String str2, final TextType textType, final Float f, final float f2, final float f3, final float f4, final TickerLocaleConfig tickerLocaleConfig, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        TextStyle textStyle2;
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        TextMeasurer textMeasurerRememberTextMeasurer;
        final float fMo5016toPx0680j_4;
        final float fMo5016toPx0680j_42;
        TickerTextAnimationState tickerTextAnimationStateRememberTickerTextAnimationState;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean z;
        Object objRememberedValue3;
        TextStyle textStyle3;
        float fFloatValue;
        List<SeparatorRenderInfo> separatorRenderInfo;
        String currentTrailingSymbol;
        boolean zChanged3;
        Object objRememberedValue4;
        Map map;
        boolean zChanged4;
        Object objRememberedValue5;
        float f5;
        TextMeasurer textMeasurer;
        final List<ColumnDataResult.ColumnData> listComponent1;
        float previousWidth;
        boolean zChanged5;
        float f6;
        Object objValueOf;
        boolean zChanged6;
        Object objRememberedValue6;
        TextStyle textStyle4;
        String str3;
        TextMeasurer textMeasurer2;
        float size;
        final float fFloatValue2;
        final float f7;
        final float fCalculateAutoSizeScale;
        boolean z2;
        Object objRememberedValue7;
        final String str4;
        boolean zChanged7;
        Object objRememberedValue8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(329835902);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    textStyle2 = textStyle;
                    i4 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changed(textType.ordinal()) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(f3) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(f4) ? 67108864 : 33554432;
                }
                if ((i3 & 512) == 0) {
                    if ((805306368 & i) == 0) {
                        i5 = (1073741824 & i) == 0 ? composerStartRestartGroup.changed(tickerLocaleConfig) : composerStartRestartGroup.changedInstance(tickerLocaleConfig) ? 536870912 : 268435456;
                    }
                    i6 = i4;
                    i7 = i3 & 1024;
                    if (i7 == 0) {
                        modifier2 = modifier;
                        i8 = i2 | 6;
                    } else {
                        modifier2 = modifier;
                        if ((i2 & 6) == 0) {
                            i8 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                        } else {
                            i8 = i2;
                        }
                    }
                    if ((i6 & 306783379) != 306783378 && (i8 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    } else {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(329835902, i6, i8, "com.robinhood.shared.ticker.TickerTextContent (TickerText.kt:130)");
                        }
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(f3);
                        fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(f4);
                        int i9 = i6 & 14;
                        Modifier modifier5 = modifier4;
                        tickerTextAnimationStateRememberTickerTextAnimationState = TickerTextAnimationState3.rememberTickerTextAnimationState(str, tickerLocaleConfig, textType, composerStartRestartGroup, i9 | ((i6 >> 24) & 112) | ((i6 >> 6) & 896), 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged = composerStartRestartGroup.changed(tickerTextAnimationStateRememberTickerTextAnimationState) | (i9 != 4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new TickerTextKt$TickerTextContent$1$1(tickerTextAnimationStateRememberTickerTextAnimationState, str, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i9);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(tickerTextAnimationStateRememberTickerTextAnimationState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new TickerTextKt$TickerTextContent$2$1(tickerTextAnimationStateRememberTickerTextAnimationState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(tickerTextAnimationStateRememberTickerTextAnimationState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        z = ((i6 & 112) != 32) | ((i6 & 896) != 256);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = TextStyle.m7655copyp1EtxEg$default(textStyle2, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        textStyle3 = (TextStyle) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        fFloatValue = tickerTextAnimationStateRememberTickerTextAnimationState.getAnimationProgress().getValue().floatValue();
                        separatorRenderInfo = tickerTextAnimationStateRememberTickerTextAnimationState.getSeparatorRenderInfo();
                        currentTrailingSymbol = tickerTextAnimationStateRememberTickerTextAnimationState.getCurrentTrailingSymbol();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged3 = composerStartRestartGroup.changed(textStyle3) | ((i6 & 1879048192) != 536870912 || ((1073741824 & i6) != 0 && composerStartRestartGroup.changed(tickerLocaleConfig)));
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = buildCharWidthCache(textType, textMeasurerRememberTextMeasurer, textStyle3, tickerLocaleConfig);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        map = (Map) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        int columnsToRender = tickerTextAnimationStateRememberTickerTextAnimationState.getColumnsToRender();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged4 = composerStartRestartGroup.changed(columnsToRender) | composerStartRestartGroup.changed(separatorRenderInfo) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changed(textStyle3);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = ColumnDataBuilder.buildColumnDataList(tickerTextAnimationStateRememberTickerTextAnimationState, separatorRenderInfo, fFloatValue, textMeasurerRememberTextMeasurer, textStyle3, map);
                            f5 = fFloatValue;
                            textMeasurer = textMeasurerRememberTextMeasurer;
                            textStyle3 = textStyle3;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            f5 = fFloatValue;
                            textMeasurer = textMeasurerRememberTextMeasurer;
                        }
                        ColumnDataResult columnDataResult = (ColumnDataResult) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        listComponent1 = columnDataResult.component1();
                        previousWidth = columnDataResult.getPreviousWidth();
                        float currentWidth = columnDataResult.getCurrentWidth();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged5 = composerStartRestartGroup.changed(textStyle3);
                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            f6 = previousWidth;
                            objValueOf = Float.valueOf((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, "0", textStyle3, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() & 4294967295L));
                            composerStartRestartGroup.updateRememberedValue(objValueOf);
                        } else {
                            objValueOf = objRememberedValue9;
                            f6 = previousWidth;
                        }
                        float fFloatValue3 = ((Number) objValueOf).floatValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged6 = composerStartRestartGroup.changed(currentTrailingSymbol) | composerStartRestartGroup.changed(textStyle3);
                        float f8 = f6;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            if (currentTrailingSymbol == null) {
                                TextStyle textStyle5 = textStyle3;
                                str3 = currentTrailingSymbol;
                                textMeasurer2 = textMeasurer;
                                textStyle4 = textStyle5;
                                size = (int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, str3, textStyle5, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32);
                            } else {
                                textStyle4 = textStyle3;
                                str3 = currentTrailingSymbol;
                                textMeasurer2 = textMeasurer;
                                size = 0.0f;
                            }
                            objRememberedValue6 = Float.valueOf(size);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            textStyle4 = textStyle3;
                            str3 = currentTrailingSymbol;
                            textMeasurer2 = textMeasurer;
                        }
                        fFloatValue2 = ((Number) objRememberedValue6).floatValue();
                        composerStartRestartGroup.endReplaceGroup();
                        float f9 = f8 + fFloatValue2;
                        float f10 = currentWidth + fFloatValue2;
                        f7 = ((f10 - f9) * f5) + f9 + fMo5016toPx0680j_4 + fMo5016toPx0680j_42;
                        fCalculateAutoSizeScale = TickerTextAutoSize.calculateAutoSizeScale(f9, f10, f5, f, f2);
                        Modifier modifierClipToBounds = Clip.clipToBounds(SizeKt.m5159requiredHeight3ABfNKs(SizeKt.m5166requiredWidth3ABfNKs(modifier5, density.mo5012toDpu2uoSUM(f7)), density.mo5012toDpu2uoSUM(fFloatValue3)));
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z2 = (i6 & 7168) == 2048;
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (!z2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TickerTextKt.TickerTextContent_iwasAgA$lambda$17$lambda$16(str2, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(modifierClipToBounds, (Function1) objRememberedValue7);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        str4 = str3;
                        zChanged7 = composerStartRestartGroup.changed(fCalculateAutoSizeScale) | composerStartRestartGroup.changedInstance(listComponent1) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changed(f5) | composerStartRestartGroup.changed(f7) | composerStartRestartGroup.changed(textStyle4) | composerStartRestartGroup.changed(textMeasurer2) | composerStartRestartGroup.changed(str4) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(fFloatValue2);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            final float f11 = f5;
                            final TextMeasurer textMeasurer3 = textMeasurer2;
                            final TextStyle textStyle6 = textStyle4;
                            objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TickerTextKt.TickerTextContent_iwasAgA$lambda$20$lambda$19(fCalculateAutoSizeScale, listComponent1, fMo5016toPx0680j_4, f11, f7, textStyle6, textMeasurer3, str4, fMo5016toPx0680j_42, fFloatValue2, (DrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifierClearAndSetSemantics, (Function1) objRememberedValue8, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TickerTextKt.TickerTextContent_iwasAgA$lambda$21(str, j, textStyle, str2, textType, f, f2, f3, f4, tickerLocaleConfig, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 = 805306368;
                i4 |= i5;
                i6 = i4;
                i7 = i3 & 1024;
                if (i7 == 0) {
                }
                if ((i6 & 306783379) != 306783378) {
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(f3);
                    fMo5016toPx0680j_42 = density2.mo5016toPx0680j_4(f4);
                    int i92 = i6 & 14;
                    Modifier modifier52 = modifier4;
                    tickerTextAnimationStateRememberTickerTextAnimationState = TickerTextAnimationState3.rememberTickerTextAnimationState(str, tickerLocaleConfig, textType, composerStartRestartGroup, i92 | ((i6 >> 24) & 112) | ((i6 >> 6) & 896), 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(tickerTextAnimationStateRememberTickerTextAnimationState) | (i92 != 4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new TickerTextKt$TickerTextContent$1$1(tickerTextAnimationStateRememberTickerTextAnimationState, str, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i92);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(tickerTextAnimationStateRememberTickerTextAnimationState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = new TickerTextKt$TickerTextContent$2$1(tickerTextAnimationStateRememberTickerTextAnimationState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(tickerTextAnimationStateRememberTickerTextAnimationState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            if ((i6 & 896) != 256) {
                            }
                            z = ((i6 & 112) != 32) | ((i6 & 896) != 256);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                objRememberedValue3 = TextStyle.m7655copyp1EtxEg$default(textStyle2, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                textStyle3 = (TextStyle) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                fFloatValue = tickerTextAnimationStateRememberTickerTextAnimationState.getAnimationProgress().getValue().floatValue();
                                separatorRenderInfo = tickerTextAnimationStateRememberTickerTextAnimationState.getSeparatorRenderInfo();
                                currentTrailingSymbol = tickerTextAnimationStateRememberTickerTextAnimationState.getCurrentTrailingSymbol();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                if ((i6 & 1879048192) != 536870912) {
                                    zChanged3 = composerStartRestartGroup.changed(textStyle3) | ((i6 & 1879048192) != 536870912 || ((1073741824 & i6) != 0 && composerStartRestartGroup.changed(tickerLocaleConfig)));
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3) {
                                        objRememberedValue4 = buildCharWidthCache(textType, textMeasurerRememberTextMeasurer, textStyle3, tickerLocaleConfig);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        map = (Map) objRememberedValue4;
                                        composerStartRestartGroup.endReplaceGroup();
                                        int columnsToRender2 = tickerTextAnimationStateRememberTickerTextAnimationState.getColumnsToRender();
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        zChanged4 = composerStartRestartGroup.changed(columnsToRender2) | composerStartRestartGroup.changed(separatorRenderInfo) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changed(textStyle3);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged4) {
                                            objRememberedValue5 = ColumnDataBuilder.buildColumnDataList(tickerTextAnimationStateRememberTickerTextAnimationState, separatorRenderInfo, fFloatValue, textMeasurerRememberTextMeasurer, textStyle3, map);
                                            f5 = fFloatValue;
                                            textMeasurer = textMeasurerRememberTextMeasurer;
                                            textStyle3 = textStyle3;
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            ColumnDataResult columnDataResult2 = (ColumnDataResult) objRememberedValue5;
                                            composerStartRestartGroup.endReplaceGroup();
                                            listComponent1 = columnDataResult2.component1();
                                            previousWidth = columnDataResult2.getPreviousWidth();
                                            float currentWidth2 = columnDataResult2.getCurrentWidth();
                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                            zChanged5 = composerStartRestartGroup.changed(textStyle3);
                                            Object objRememberedValue92 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged5) {
                                                f6 = previousWidth;
                                                objValueOf = Float.valueOf((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, "0", textStyle3, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() & 4294967295L));
                                                composerStartRestartGroup.updateRememberedValue(objValueOf);
                                                float fFloatValue32 = ((Number) objValueOf).floatValue();
                                                composerStartRestartGroup.endReplaceGroup();
                                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                zChanged6 = composerStartRestartGroup.changed(currentTrailingSymbol) | composerStartRestartGroup.changed(textStyle3);
                                                float f82 = f6;
                                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged6) {
                                                    if (currentTrailingSymbol == null) {
                                                    }
                                                    objRememberedValue6 = Float.valueOf(size);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                    fFloatValue2 = ((Number) objRememberedValue6).floatValue();
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    float f92 = f82 + fFloatValue2;
                                                    float f102 = currentWidth2 + fFloatValue2;
                                                    f7 = ((f102 - f92) * f5) + f92 + fMo5016toPx0680j_4 + fMo5016toPx0680j_42;
                                                    fCalculateAutoSizeScale = TickerTextAutoSize.calculateAutoSizeScale(f92, f102, f5, f, f2);
                                                    Modifier modifierClipToBounds2 = Clip.clipToBounds(SizeKt.m5159requiredHeight3ABfNKs(SizeKt.m5166requiredWidth3ABfNKs(modifier52, density2.mo5012toDpu2uoSUM(f7)), density2.mo5012toDpu2uoSUM(fFloatValue32)));
                                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                                    if ((i6 & 7168) == 2048) {
                                                    }
                                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                    if (!z2) {
                                                        objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda4
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return TickerTextKt.TickerTextContent_iwasAgA$lambda$17$lambda$16(str2, (SemanticsPropertyReceiver) obj);
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        Modifier modifierClearAndSetSemantics2 = SemanticsModifier6.clearAndSetSemantics(modifierClipToBounds2, (Function1) objRememberedValue7);
                                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                        str4 = str3;
                                                        zChanged7 = composerStartRestartGroup.changed(fCalculateAutoSizeScale) | composerStartRestartGroup.changedInstance(listComponent1) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changed(f5) | composerStartRestartGroup.changed(f7) | composerStartRestartGroup.changed(textStyle4) | composerStartRestartGroup.changed(textMeasurer2) | composerStartRestartGroup.changed(str4) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(fFloatValue2);
                                                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChanged7) {
                                                            final float f112 = f5;
                                                            final TextMeasurer textMeasurer32 = textMeasurer2;
                                                            final TextStyle textStyle62 = textStyle4;
                                                            objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda5
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return TickerTextKt.TickerTextContent_iwasAgA$lambda$20$lambda$19(fCalculateAutoSizeScale, listComponent1, fMo5016toPx0680j_4, f112, f7, textStyle62, textMeasurer32, str4, fMo5016toPx0680j_42, fFloatValue2, (DrawScope) obj);
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            Canvas2.Canvas(modifierClearAndSetSemantics2, (Function1) objRememberedValue8, composerStartRestartGroup, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            modifier3 = modifier52;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i4 |= i5;
            i6 = i4;
            i7 = i3 & 1024;
            if (i7 == 0) {
            }
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        textStyle2 = textStyle;
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i4 |= i5;
        i6 = i4;
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerTextContent_iwasAgA$lambda$20$lambda$19(float f, List list, float f2, float f3, float f4, TextStyle textStyle, TextMeasurer textMeasurer, String str, float f5, float f6, DrawScope drawScope) throws Throwable {
        long j;
        long j2;
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long jMo6962getCenterF1C5BW0 = Canvas.mo6962getCenterF1C5BW0();
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6942scale0AR0LA0(f, f, jMo6962getCenterF1C5BW0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ColumnDataResult.ColumnData columnData = (ColumnDataResult.ColumnData) it.next();
                    TickerColumnSnapshot snapshot = columnData.getSnapshot();
                    float fCoerceAtMost = RangesKt.coerceAtMost(f2 + columnData.animatedX(f3), f4);
                    float currentCharOffset = columnData.getCurrentCharOffset();
                    Float previousCharOffset = columnData.getPreviousCharOffset();
                    float currentCharAlpha = columnData.getCurrentCharAlpha();
                    j2 = jMo6936getSizeNHjbRc;
                    try {
                        TextPainter2.m7629drawTextTPWCCtM(Canvas, textMeasurer, String.valueOf(snapshot.getCurrentChar()), (496 & 4) != 0 ? Offset.INSTANCE.m6553getZeroF1C5BW0() : Offset.m6535constructorimpl((Float.floatToRawIntBits(fCoerceAtMost) << 32) | (Float.floatToRawIntBits(currentCharOffset * Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L))) & 4294967295L)), (496 & 8) != 0 ? TextStyle.INSTANCE.getDefault() : currentCharAlpha < 1.0f ? TextStyle.m7655copyp1EtxEg$default(textStyle, Color.m6705copywmQWz5c$default(textStyle.m7661getColor0d7_KjU(), currentCharAlpha, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null) : textStyle, (496 & 16) != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : 0, (496 & 32) != 0, (496 & 64) != 0 ? Integer.MAX_VALUE : 0, (496 & 128) != 0 ? Size.INSTANCE.m6588getUnspecifiedNHjbRc() : 0L, (496 & 256) != 0 ? DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU() : 0);
                        Float previousCharAlpha = columnData.getPreviousCharAlpha();
                        if (snapshot.getPreviousChar() != null && previousCharOffset != null && previousCharAlpha != null) {
                            TextPainter2.m7629drawTextTPWCCtM(drawScope, textMeasurer, snapshot.getPreviousChar().toString(), (496 & 4) != 0 ? Offset.INSTANCE.m6553getZeroF1C5BW0() : Offset.m6535constructorimpl((Float.floatToRawIntBits(previousCharOffset.floatValue() * Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fCoerceAtMost) << 32)), (496 & 8) != 0 ? TextStyle.INSTANCE.getDefault() : TextStyle.m7655copyp1EtxEg$default(textStyle, Color.m6705copywmQWz5c$default(textStyle.m7661getColor0d7_KjU(), previousCharAlpha.floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (496 & 16) != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : 0, (496 & 32) != 0, (496 & 64) != 0 ? Integer.MAX_VALUE : 0, (496 & 128) != 0 ? Size.INSTANCE.m6588getUnspecifiedNHjbRc() : 0L, (496 & 256) != 0 ? DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU() : 0);
                        }
                        Canvas = drawScope;
                        jMo6936getSizeNHjbRc = j2;
                    } catch (Throwable th) {
                        th = th;
                        j = j2;
                        drawContext.getCanvas().restore();
                        drawContext.mo6937setSizeuvyYCjk(j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j2 = jMo6936getSizeNHjbRc;
                    j = j2;
                    drawContext.getCanvas().restore();
                    drawContext.mo6937setSizeuvyYCjk(j);
                    throw th;
                }
            }
            j2 = jMo6936getSizeNHjbRc;
            if (str != null) {
                TextPainter2.m7629drawTextTPWCCtM(drawScope, textMeasurer, str, (496 & 4) != 0 ? Offset.INSTANCE.m6553getZeroF1C5BW0() : Offset.m6535constructorimpl((Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() >> 32)) - f5) - f6) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), (496 & 8) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle, (496 & 16) != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : 0, (496 & 32) != 0, (496 & 64) != 0 ? Integer.MAX_VALUE : 0, (496 & 128) != 0 ? Size.INSTANCE.m6588getUnspecifiedNHjbRc() : 0L, (496 & 256) != 0 ? DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU() : 0);
            }
            drawContext.getCanvas().restore();
            drawContext.mo6937setSizeuvyYCjk(j2);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            j = jMo6936getSizeNHjbRc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerTextContent_iwasAgA$lambda$17$lambda$16(String str, SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, str);
        return Unit.INSTANCE;
    }

    public static final Map<Character, Float> buildCharWidthCache(TextType textType, TextMeasurer textMeasurer, TextStyle textStyle, TickerLocaleConfig localeConfig) {
        Set<Character> moneyCharacters;
        Intrinsics.checkNotNullParameter(textType, "textType");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        TextStyle style = textStyle;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = WhenMappings.$EnumSwitchMapping$0[textType.ordinal()];
        if (i == 1) {
            moneyCharacters = localeConfig.getMoneyCharacters();
        } else if (i == 2) {
            moneyCharacters = SetsKt.plus(localeConfig.getMoneyCharacters(), Character.valueOf(localeConfig.getPercentSymbol()));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            moneyCharacters = SetsKt.emptySet();
        }
        Iterator it = moneyCharacters.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((Character) it.next(), Float.valueOf((int) (TextMeasurer.m7623measurewNUYSr0$default(textMeasurer, String.valueOf(r1.charValue()), style, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() >> 32)));
            it = it;
            style = textStyle;
        }
        return linkedHashMap;
    }

    public static final void TickerTextAnimatedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1194286549);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1194286549, i, -1, "com.robinhood.shared.ticker.TickerTextAnimatedPreview (TickerText.kt:318)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new TickerTextKt$TickerTextAnimatedPreview$1$1(snapshotIntState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            m25793TickerText5WbBtfw(PREVIEW_VALUES.get(snapshotIntState2.getIntValue()), Color.INSTANCE.m6716getBlack0d7_KjU(), new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (DefaultConstructorMarker) null), PREVIEW_CONFIG, SizeKt.m5155defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(100), 0.0f, 2, null), null, null, null, false, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 28080, 0, 4064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TickerTextKt.TickerTextAnimatedPreview$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TickerTextMoneyTypePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(410731000);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(410731000, i, -1, "com.robinhood.shared.ticker.TickerTextMoneyTypePreview (TickerText.kt:339)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new TickerTextKt$TickerTextMoneyTypePreview$1$1(snapshotIntState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            m25793TickerText5WbBtfw(PREVIEW_CRYPTO_VALUES.get(snapshotIntState2.getIntValue()), Color.INSTANCE.m6716getBlack0d7_KjU(), new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (DefaultConstructorMarker) null), PREVIEW_CONFIG, SizeKt.m5155defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(100), 0.0f, 2, null), null, null, TextType.MONEY, false, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 12610992, 0, 3936);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TickerTextKt.TickerTextMoneyTypePreview$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TickerTextStaticPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534782410);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1534782410, i, -1, "com.robinhood.shared.ticker.TickerTextStaticPreview (TickerText.kt:361)");
            }
            m25793TickerText5WbBtfw("$1,234.56", Color.INSTANCE.m6716getBlack0d7_KjU(), new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (DefaultConstructorMarker) null), PREVIEW_CONFIG, null, null, null, null, false, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 3510, 0, 4080);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.ticker.TickerTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TickerTextKt.TickerTextStaticPreview$lambda$33(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
