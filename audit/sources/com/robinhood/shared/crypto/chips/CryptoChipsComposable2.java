package com.robinhood.shared.crypto.chips;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.CornerSize2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorMatrix;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.Coil;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter4;
import coil.request.ImageRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.http.Headers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoChipsComposable.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001aS\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0014\u001aU\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u00012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0002\u0010#¨\u0006$²\u0006\n\u0010%\u001a\u00020\u001cX\u008a\u008e\u0002"}, m3636d2 = {"CryptoChipsComposable", "", "chips", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.STYLE, "Lcom/robinhood/shared/crypto/chips/CryptoChipsStyle;", "eventLoggingState", "Lcom/robinhood/shared/crypto/chips/CryptoChipsEventLoggingState;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/chips/CryptoChipsStyle;Lcom/robinhood/shared/crypto/chips/CryptoChipsEventLoggingState;Landroidx/compose/runtime/Composer;II)V", "Chip", "chip", "Lcom/robinhood/shared/crypto/chips/CryptoChip$Loaded;", "position", "", "totalItemCount", "onChipClick", "Lkotlin/Function1;", "(Lcom/robinhood/shared/crypto/chips/CryptoChip$Loaded;IILkotlin/jvm/functions/Function1;Lcom/robinhood/shared/crypto/chips/CryptoChipsStyle;Lcom/robinhood/shared/crypto/chips/CryptoChipsEventLoggingState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChipLogo", "name", "", "logoUrl", "size", "Landroidx/compose/ui/unit/Dp;", "enabled", "", "showPlaceholder", "logoBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "ChipLogo-uZ2CTGY", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;FZZLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "CryptoChipsPreview", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "lib-crypto-chips_externalDebug", "imageLoaded"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoChipsComposable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chip$lambda$9(CryptoChipsComposable.Loaded loaded, int i, int i2, Function1 function1, CryptoChipsStyle cryptoChipsStyle, CryptoChipsEventLoggingState cryptoChipsEventLoggingState, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        Chip(loaded, i, i2, function1, cryptoChipsStyle, cryptoChipsEventLoggingState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChipLogo_uZ2CTGY$lambda$19(String str, String str2, Modifier modifier, float f, boolean z, boolean z2, Color color, int i, int i2, Composer composer, int i3) {
        m24906ChipLogouZ2CTGY(str, str2, modifier, f, z, z2, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoChipsComposable$lambda$2(ImmutableList immutableList, Modifier modifier, CryptoChipsStyle cryptoChipsStyle, CryptoChipsEventLoggingState cryptoChipsEventLoggingState, int i, int i2, Composer composer, int i3) {
        CryptoChipsComposable(immutableList, modifier, cryptoChipsStyle, cryptoChipsEventLoggingState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoChipsPreview$lambda$20(ImmutableList immutableList, int i, Composer composer, int i2) {
        CryptoChipsPreview(immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final boolean ChipLogo_uZ2CTGY$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoChipsComposable(final ImmutableList<? extends CryptoChipsComposable> chips, Modifier modifier, CryptoChipsStyle cryptoChipsStyle, CryptoChipsEventLoggingState cryptoChipsEventLoggingState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoChipsStyle cryptoChipsStyle2;
        CryptoChipsEventLoggingState cryptoChipsEventLoggingState2;
        final CryptoChipsEventLoggingState cryptoChipsEventLoggingState3;
        final Navigator navigator;
        final Context context;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        final CryptoChipsStyle cryptoChipsStyle3;
        Composer composer2;
        final Modifier modifier3;
        final CryptoChipsStyle cryptoChipsStyle4;
        final CryptoChipsEventLoggingState cryptoChipsEventLoggingState4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chips, "chips");
        Composer composerStartRestartGroup = composer.startRestartGroup(510787088);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(chips) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoChipsStyle2 = cryptoChipsStyle;
                    int i5 = composerStartRestartGroup.changed(cryptoChipsStyle2) ? 256 : 128;
                    i3 |= i5;
                } else {
                    cryptoChipsStyle2 = cryptoChipsStyle;
                }
                i3 |= i5;
            } else {
                cryptoChipsStyle2 = cryptoChipsStyle;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoChipsEventLoggingState2 = cryptoChipsEventLoggingState;
                    int i6 = composerStartRestartGroup.changed(cryptoChipsEventLoggingState2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoChipsEventLoggingState2 = cryptoChipsEventLoggingState;
                }
                i3 |= i6;
            } else {
                cryptoChipsEventLoggingState2 = cryptoChipsEventLoggingState;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        cryptoChipsStyle2 = CryptoChipsStyle.INSTANCE.getDefault(composerStartRestartGroup, 6);
                    }
                    if ((i2 & 8) == 0) {
                        i3 &= -7169;
                        modifier2 = modifier4;
                        cryptoChipsEventLoggingState3 = CryptoChipsEventLoggingState.INSTANCE.getDefault();
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(510787088, i3, -1, "com.robinhood.shared.crypto.chips.CryptoChipsComposable (CryptoChipsComposable.kt:126)");
                        }
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                        z = true;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(cryptoChipsStyle2)) || (i3 & 384) == 256);
                        if ((((i3 & 7168) ^ 3072) <= 2048 || !composerStartRestartGroup.changed(cryptoChipsEventLoggingState3)) && (i3 & 3072) != 2048) {
                            z = false;
                        }
                        z2 = zChangedInstance | z;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            cryptoChipsStyle3 = cryptoChipsStyle2;
                            Function1 function1 = new Function1() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoChipsComposable2.CryptoChipsComposable$lambda$1$lambda$0(chips, navigator, context, cryptoChipsStyle3, cryptoChipsEventLoggingState3, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        } else {
                            cryptoChipsStyle3 = cryptoChipsStyle2;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier2;
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyRow(modifierFillMaxWidth$default, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 506);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        cryptoChipsStyle4 = cryptoChipsStyle3;
                        cryptoChipsEventLoggingState4 = cryptoChipsEventLoggingState3;
                    } else {
                        modifier2 = modifier4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                cryptoChipsEventLoggingState3 = cryptoChipsEventLoggingState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = PaddingKt.m5137PaddingValuesYgX7TsA$default(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                z = true;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                if (((i3 & 896) ^ 384) <= 256) {
                    boolean zChangedInstance2 = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(cryptoChipsStyle2)) || (i3 & 384) == 256);
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                        z = false;
                        z2 = zChangedInstance2 | z;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                            cryptoChipsStyle3 = cryptoChipsStyle2;
                            Function1 function12 = new Function1() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoChipsComposable2.CryptoChipsComposable$lambda$1$lambda$0(chips, navigator, context, cryptoChipsStyle3, cryptoChipsEventLoggingState3, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function12);
                            objRememberedValue = function12;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier2;
                            composer2 = composerStartRestartGroup;
                            LazyDslKt.LazyRow(modifierFillMaxWidth$default2, null, paddingValuesM5137PaddingValuesYgX7TsA$default2, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 506);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                            cryptoChipsStyle4 = cryptoChipsStyle3;
                            cryptoChipsEventLoggingState4 = cryptoChipsEventLoggingState3;
                        }
                    } else {
                        z = false;
                        z2 = zChangedInstance2 | z;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                        }
                    }
                } else {
                    boolean zChangedInstance22 = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((((i3 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(cryptoChipsStyle2)) || (i3 & 384) == 256);
                    if (((i3 & 7168) ^ 3072) <= 2048) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                cryptoChipsStyle4 = cryptoChipsStyle2;
                cryptoChipsEventLoggingState4 = cryptoChipsEventLoggingState2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoChipsComposable2.CryptoChipsComposable$lambda$2(chips, modifier3, cryptoChipsStyle4, cryptoChipsEventLoggingState4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoChipsComposable$lambda$1$lambda$0(ImmutableList immutableList, Navigator navigator, Context context, CryptoChipsStyle cryptoChipsStyle, CryptoChipsEventLoggingState cryptoChipsEventLoggingState, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.item$default(LazyRow, null, null, ComposableLambda3.composableLambdaInstance(-456773299, true, new CryptoChipsComposable3(immutableList, navigator, context, cryptoChipsStyle, cryptoChipsEventLoggingState)), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(final CryptoChipsComposable.Loaded loaded, final int i, final int i2, final Function1<? super CryptoChipsComposable, Unit> function1, final CryptoChipsStyle cryptoChipsStyle, final CryptoChipsEventLoggingState cryptoChipsEventLoggingState, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        BentoTheme bentoTheme;
        int i9;
        ?? r3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        String secondaryText;
        String percentChange;
        long jM21425getFg0d7_KjU;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1290638127);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(loaded) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
            i6 = i;
        } else {
            i6 = i;
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
            }
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
            i7 = i2;
        } else {
            i7 = i2;
            if ((i3 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(i7) ? 256 : 128;
            }
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else {
            if ((i3 & 24576) == 0) {
                i5 |= composerStartRestartGroup.changed(cryptoChipsStyle) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= 196608;
            } else {
                if ((i3 & 196608) == 0) {
                    i5 |= composerStartRestartGroup.changed(cryptoChipsEventLoggingState) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                    if ((1572864 & i3) == 0) {
                        modifier2 = modifier;
                        i5 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                    }
                    if ((599187 & i5) != 599186 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    } else {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1290638127, i5, -1, "com.robinhood.shared.crypto.chips.Chip (CryptoChipsComposable.kt:189)");
                        }
                        float f = 20;
                        RoundedCornerShape RoundedCornerShape = RoundedCornerShape2.RoundedCornerShape(CornerSize2.m5326CornerSize0680j_4(C2002Dp.m7995constructorimpl(f)));
                        composerStartRestartGroup.startReplaceGroup(-942283520);
                        composerStartRestartGroup.startReplaceGroup(-942290142);
                        Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(modifier4, null, false, 3, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        Modifier modifier5 = modifier4;
                        Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(Background3.m4871backgroundbw27NRU(modifierWrapContentWidth$default, bentoTheme2.getColors(composerStartRestartGroup, i10).m21371getBg0d7_KjU(), RoundedCornerShape), RoundedCornerShape), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i10).m21373getBg30d7_KjU(), RoundedCornerShape2.RoundedCornerShape(CornerSize2.m5326CornerSize0680j_4(C2002Dp.m7995constructorimpl(f))));
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        z = ((i5 & 7168) != 2048) | ((i5 & 14) != 4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoChipsComposable2.Chip$lambda$5$lambda$4(function1, loaded);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4876borderxT4_qwU, false, null, null, (Function0) objRememberedValue, 7, null);
                        if (loaded.isPlaceholder()) {
                            bentoTheme = bentoTheme2;
                            i9 = i10;
                            r3 = 0;
                            modifierM4893clickableXHw0xAI$default = modifierM4893clickableXHw0xAI$default.then(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(i6, i7, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.CHIP, cryptoChipsEventLoggingState.getComponentIdPrefix() + loaded.getPrimaryText(), null, 4, null), null, 39, null), true, false, false, true, false, null, 108, null));
                        } else {
                            bentoTheme = bentoTheme2;
                            i9 = i10;
                            r3 = 0;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r3);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String primaryText = loaded.getPrimaryText();
                        String logoUrl = loaded.getLogoUrl();
                        float fM24911getLogoSizeD9Ej5fM = cryptoChipsStyle.m24911getLogoSizeD9Ej5fM();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        m24906ChipLogouZ2CTGY(primaryText, logoUrl, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, cryptoChipsStyle.m24912getLogoStartPaddingD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 1, null), fM24911getLogoSizeD9Ej5fM, false, false, null, composerStartRestartGroup, 0, 112);
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(loaded.getPrimaryText(), PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i9).getTextM(), composer2, 0, 0, 8188);
                        secondaryText = loaded.getSecondaryText();
                        composer2.startReplaceGroup(806256568);
                        if (secondaryText != null) {
                            BentoText2.m20747BentoText38GnDrw(secondaryText, PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i9).getTextM(), composer2, 0, 0, 8184);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        percentChange = loaded.getPercentChange();
                        TextStyle textM = bentoTheme.getTypography(composer2, i9).getTextM();
                        if (!StringsKt.startsWith$default(percentChange, "+", (boolean) r3, 2, (Object) null)) {
                            composer2.startReplaceGroup(-775406091);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i9).m21456getPositive0d7_KjU();
                            composer2.endReplaceGroup();
                        } else if (StringsKt.startsWith$default(percentChange, "-", (boolean) r3, 2, (Object) null)) {
                            composer2.startReplaceGroup(-775311851);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i9).m21452getNegative0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-775248549);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i9).m21425getFg0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(percentChange, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), 0.0f, bentoTheme.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 1, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7958getClipgIe3tQ8(), false, 1, 0, null, 0, textM, composer2, 817889280, 0, 7544);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoChipsComposable2.Chip$lambda$9(loaded, i, i2, function1, cryptoChipsStyle, cryptoChipsEventLoggingState, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                modifier2 = modifier;
                if ((599187 & i5) != 599186) {
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float f2 = 20;
                    RoundedCornerShape RoundedCornerShape2 = RoundedCornerShape2.RoundedCornerShape(CornerSize2.m5326CornerSize0680j_4(C2002Dp.m7995constructorimpl(f2)));
                    composerStartRestartGroup.startReplaceGroup(-942283520);
                    composerStartRestartGroup.startReplaceGroup(-942290142);
                    Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(modifier4, null, false, 3, null);
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i102 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(Clip.clip(Background3.m4871backgroundbw27NRU(modifierWrapContentWidth$default2, bentoTheme22.getColors(composerStartRestartGroup, i102).m21371getBg0d7_KjU(), RoundedCornerShape2), RoundedCornerShape2), C2002Dp.m7995constructorimpl(1), bentoTheme22.getColors(composerStartRestartGroup, i102).m21373getBg30d7_KjU(), RoundedCornerShape2.RoundedCornerShape(CornerSize2.m5326CornerSize0680j_4(C2002Dp.m7995constructorimpl(f2))));
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z = ((i5 & 7168) != 2048) | ((i5 & 14) != 4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoChipsComposable2.Chip$lambda$5$lambda$4(function1, loaded);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM4876borderxT4_qwU2, false, null, null, (Function0) objRememberedValue, 7, null);
                        if (loaded.isPlaceholder()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r3);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            String primaryText2 = loaded.getPrimaryText();
                            String logoUrl2 = loaded.getLogoUrl();
                            float fM24911getLogoSizeD9Ej5fM2 = cryptoChipsStyle.m24911getLogoSizeD9Ej5fM();
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            m24906ChipLogouZ2CTGY(primaryText2, logoUrl2, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion22, cryptoChipsStyle.m24912getLogoStartPaddingD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 1, null), fM24911getLogoSizeD9Ej5fM2, false, false, null, composerStartRestartGroup, 0, 112);
                            composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(loaded.getPrimaryText(), PaddingKt.m5144paddingVpY3zN4$default(companion22, 0.0f, bentoTheme.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i9).getTextM(), composer2, 0, 0, 8188);
                            secondaryText = loaded.getSecondaryText();
                            composer2.startReplaceGroup(806256568);
                            if (secondaryText != null) {
                            }
                            composer2.endReplaceGroup();
                            percentChange = loaded.getPercentChange();
                            TextStyle textM2 = bentoTheme.getTypography(composer2, i9).getTextM();
                            if (!StringsKt.startsWith$default(percentChange, "+", (boolean) r3, 2, (Object) null)) {
                            }
                            BentoText2.m20747BentoText38GnDrw(percentChange, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), 0.0f, bentoTheme.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 1, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7958getClipgIe3tQ8(), false, 1, 0, null, 0, textM2, composer2, 817889280, 0, 7544);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            modifier2 = modifier;
            if ((599187 & i5) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i4 & 32) == 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        if ((599187 & i5) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chip$lambda$5$lambda$4(Function1 function1, CryptoChipsComposable.Loaded loaded) {
        function1.invoke(loaded);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /* renamed from: ChipLogo-uZ2CTGY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24906ChipLogouZ2CTGY(final String name, final String str, Modifier modifier, float f, boolean z, boolean z2, Color color, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float fM24911getLogoSizeD9Ej5fM;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        Color color2;
        boolean z5;
        float f2;
        int i8;
        Color color3;
        final boolean z6;
        Object objRememberedValue;
        Composer.Companion companion;
        Modifier modifier3;
        Composer composer2;
        final float f3;
        final Modifier modifier4;
        final Color color4;
        ColorFilter colorFilterM6730colorMatrixjHGOpc;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(name, "name");
        Composer composerStartRestartGroup = composer.startRestartGroup(153547588);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(name) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    fM24911getLogoSizeD9Ej5fM = f;
                    int i10 = composerStartRestartGroup.changed(fM24911getLogoSizeD9Ej5fM) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    fM24911getLogoSizeD9Ej5fM = f;
                }
                i3 |= i10;
            } else {
                fM24911getLogoSizeD9Ej5fM = f;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((i & 196608) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        i7 = 196608;
                        color2 = color;
                    } else {
                        i7 = 196608;
                        color2 = color;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(color2) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                fM24911getLogoSizeD9Ej5fM = CryptoChipsStyle.INSTANCE.getDefault(composerStartRestartGroup, 6).m24911getLogoSizeD9Ej5fM();
                            }
                            boolean z7 = i4 == 0 ? true : z;
                            if (i5 != 0) {
                                z4 = true;
                            }
                            int i11 = i3;
                            z5 = z7;
                            f2 = fM24911getLogoSizeD9Ej5fM;
                            i8 = i11;
                            color3 = i6 == 0 ? null : color;
                            z6 = z4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            color3 = color;
                            f2 = fM24911getLogoSizeD9Ej5fM;
                            z6 = z4;
                            i8 = i3;
                            z5 = z;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(153547588, i8, -1, "com.robinhood.shared.crypto.chips.ChipLogo (CryptoChipsComposable.kt:274)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        final long jM21880getColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPlaceholder(composerStartRestartGroup, 0).m21880getColor0d7_KjU();
                        if (str != null || str.length() == 0) {
                            boolean z8 = z5;
                            composerStartRestartGroup.startReplaceGroup(196445656);
                            Object objFirstOrNull = StringsKt.firstOrNull(name);
                            z3 = z8;
                            modifier3 = modifier2;
                            BentoPogKt.m20686BentoTextPogTYpPzmw((objFirstOrNull != null ? objFirstOrNull : "").toString(), modifier3, z3, false, null, BentoPogSize.Number, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU()), composerStartRestartGroup, ((i8 >> 3) & 112) | i7 | ((i8 >> 6) & 896), 88);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(196742481);
                            ImageRequest imageRequestBuild = new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(str).setHeader(Headers.USER_AGENT, "").build();
                            ImageLoader imageLoader = Coil.imageLoader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoChipsComposable2.ChipLogo_uZ2CTGY$lambda$14$lambda$13(snapshotState, (AsyncImagePainter.State) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            boolean z9 = z5;
                            AsyncImagePainter asyncImagePainterM9105rememberAsyncImagePainter0YpotYA = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(imageRequestBuild, imageLoader, null, (Function1) objRememberedValue2, null, 0, null, composerStartRestartGroup, 3072, 116);
                            ContentScale fit = ContentScale.INSTANCE.getFit();
                            composerStartRestartGroup.startReplaceGroup(1530385858);
                            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(modifier2, f2);
                            composerStartRestartGroup.startReplaceGroup(1530386646);
                            if ((!ChipLogo_uZ2CTGY$lambda$11(snapshotState) || str.length() == 0) && z6) {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean zChanged = composerStartRestartGroup.changed(jM21880getColor0d7_KjU);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoChipsComposable2.ChipLogo_uZ2CTGY$lambda$17$lambda$16$lambda$15(jM21880getColor0d7_KjU, (DrawScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                modifierM5169size3ABfNKs = DrawModifierKt.drawBehind(modifierM5169size3ABfNKs, (Function1) objRememberedValue3);
                            } else if (color3 != null) {
                                modifierM5169size3ABfNKs = Background3.m4871backgroundbw27NRU(modifierM5169size3ABfNKs, Color.m6705copywmQWz5c$default(color3.getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShape2.getCircleShape());
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierClip = Clip.clip(modifierM5169size3ABfNKs, RoundedCornerShape2.getCircleShape());
                            if (z9) {
                                colorFilterM6730colorMatrixjHGOpc = null;
                            } else {
                                ColorFilter.Companion companion2 = ColorFilter.INSTANCE;
                                float[] fArrM6737constructorimpl$default = ColorMatrix.m6737constructorimpl$default(null, 1, null);
                                ColorMatrix.m6739setToSaturationimpl(fArrM6737constructorimpl$default, 0.0f);
                                colorFilterM6730colorMatrixjHGOpc = companion2.m6730colorMatrixjHGOpc(fArrM6737constructorimpl$default);
                            }
                            composer2 = composerStartRestartGroup;
                            ImageKt.Image(asyncImagePainterM9105rememberAsyncImagePainter0YpotYA, "", modifierClip, (Alignment) null, fit, 0.0f, colorFilterM6730colorMatrixjHGOpc, composer2, 24624, 40);
                            composer2.endReplaceGroup();
                            z3 = z9;
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f3 = f2;
                        modifier4 = modifier3;
                        color4 = color3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        f3 = fM24911getLogoSizeD9Ej5fM;
                        color4 = color2;
                        z6 = z4;
                    }
                    final boolean z10 = z3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoChipsComposable2.ChipLogo_uZ2CTGY$lambda$19(name, str, modifier4, f3, z10, z6, color4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z4 = z2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        int i112 = i3;
                        z5 = z7;
                        f2 = fM24911getLogoSizeD9Ej5fM;
                        i8 = i112;
                        if (i6 == 0) {
                        }
                        z6 = z4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        final long jM21880getColor0d7_KjU2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPlaceholder(composerStartRestartGroup, 0).m21880getColor0d7_KjU();
                        if (str != null) {
                            boolean z82 = z5;
                            composerStartRestartGroup.startReplaceGroup(196445656);
                            Object objFirstOrNull2 = StringsKt.firstOrNull(name);
                            z3 = z82;
                            modifier3 = modifier2;
                            BentoPogKt.m20686BentoTextPogTYpPzmw((objFirstOrNull2 != null ? objFirstOrNull2 : "").toString(), modifier3, z3, false, null, BentoPogSize.Number, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU()), composerStartRestartGroup, ((i8 >> 3) & 112) | i7 | ((i8 >> 6) & 896), 88);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f3 = f2;
                            modifier4 = modifier3;
                            color4 = color3;
                        }
                    }
                }
                final boolean z102 = z3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z4 = z2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            final boolean z1022 = z3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        final boolean z10222 = z3;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ChipLogo_uZ2CTGY$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChipLogo_uZ2CTGY$lambda$14$lambda$13(SnapshotState snapshotState, AsyncImagePainter.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ChipLogo_uZ2CTGY$lambda$12(snapshotState, it instanceof AsyncImagePainter.State.Success);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChipLogo_uZ2CTGY$lambda$17$lambda$16$lambda$15(long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6947drawCircleVaOC9Bg$default(drawBehind, j, 0.0f, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    @DayNightPreview
    private static final void CryptoChipsPreview(final ImmutableList<? extends CryptoChipsComposable> immutableList, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2046146295);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(immutableList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2046146295, i2, -1, "com.robinhood.shared.crypto.chips.CryptoChipsPreview (CryptoChipsComposable.kt:354)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), ComposableLambda3.rememberComposableLambda(1400135113, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt.CryptoChipsPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1400135113, i3, -1, "com.robinhood.shared.crypto.chips.CryptoChipsPreview.<anonymous> (CryptoChipsComposable.kt:356)");
                    }
                    Boolean boolValueOf = Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composer2, 0));
                    final ImmutableList<CryptoChipsComposable> immutableList2 = immutableList;
                    BentoTheme2.BentoTheme(boolValueOf, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-324114559, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt.CryptoChipsPreview.1.1
                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-324114559, i4, -1, "com.robinhood.shared.crypto.chips.CryptoChipsPreview.<anonymous>.<anonymous> (CryptoChipsComposable.kt:357)");
                            }
                            ImmutableList<CryptoChipsComposable> immutableList3 = immutableList2;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            float f = 16;
                            CryptoChipsComposable2.CryptoChipsComposable(immutableList3, PaddingKt.m5142padding3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), null, null, composer3, 48, 12);
                            CryptoChipsComposable2.CryptoChipsComposable(immutableList3, PaddingKt.m5142padding3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), new CryptoChipsStyle(C2002Dp.m7995constructorimpl(8), C2002Dp.m7995constructorimpl(24), null), null, composer3, 48, 8);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoChipsComposable2.CryptoChipsPreview$lambda$20(immutableList, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
