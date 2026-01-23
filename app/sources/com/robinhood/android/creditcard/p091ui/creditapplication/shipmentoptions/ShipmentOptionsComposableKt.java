package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.Coil;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter4;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.components.AddressMapComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShipmentOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0015\u001a;\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\"\u001a\u0017\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010$\u001a\u0017\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010$\"\u000e\u0010&\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006-²\u0006\n\u0010.\u001a\u00020\u0007X\u008a\u008e\u0002"}, m3636d2 = {"ShipmentOptions", "", "onEditAddress", "Lkotlin/Function0;", "onContinue", "Lkotlin/Function2;", "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "isSolidGold", "entryPointSource", "", "lat", "", "long", "options", "Lkotlinx/collections/immutable/ImmutableList;", "isLoading", "defaultSelectedOption", "sigRequired", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;ZLandroidx/compose/runtime/Composer;III)V", "ShipmentOptionsRow", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "selected", "modifier", "Landroidx/compose/ui/Modifier;", "onOptionClicked", "Lkotlin/Function1;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SolidGoldOption", "(Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LogoImage", "logoUrl", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ShipmentOptionsRowLoading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SolidGoldOptionLoading", "SHIPMENT_OPTIONS_SIGNATURE_TEST_TAG", "SHIPMENT_OPTIONS_TITLE_TEST_TAG", "SHIPMENT_OPTIONS_SUBTITLE_TEST_TAG", "SHIPMENT_OPTIONS_CHANGE_ADDRESS_TEST_TAG", "SHIPMENT_OPTIONS_LOADING_ROW_TEST_TAG", "SHIPMENT_OPTIONS_SOLID_GOLD_LOADING_TEST_TAG", "SHIPMENT_OPTIONS_SOLID_GOLD_LOADING_MESSAGE_TEST_TAG", "feature-credit-card_externalDebug", "imageLoaded"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ShipmentOptionsComposableKt {
    public static final String SHIPMENT_OPTIONS_CHANGE_ADDRESS_TEST_TAG = "shipment-options-change-address-test-tag";
    public static final String SHIPMENT_OPTIONS_LOADING_ROW_TEST_TAG = "shipment-options-loading-row-test-tag";
    public static final String SHIPMENT_OPTIONS_SIGNATURE_TEST_TAG = "shipment-options-signature-test-tag";
    public static final String SHIPMENT_OPTIONS_SOLID_GOLD_LOADING_MESSAGE_TEST_TAG = "shipment-options-solid-gold-loading-message-test-tag";
    public static final String SHIPMENT_OPTIONS_SOLID_GOLD_LOADING_TEST_TAG = "shipment-options-solid-gold-loading-test-tag";
    public static final String SHIPMENT_OPTIONS_SUBTITLE_TEST_TAG = "shipment-options-subtitle-test-tag";
    public static final String SHIPMENT_OPTIONS_TITLE_TEST_TAG = "shipment-options-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LogoImage$lambda$14(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LogoImage(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShipmentOptions$lambda$4(Function0 function0, Function2 function2, AddressType addressType, boolean z, String str, Double d, Double d2, ImmutableList immutableList, boolean z2, ShipmentOption shipmentOption, boolean z3, int i, int i2, int i3, Composer composer, int i4) {
        ShipmentOptions(function0, function2, addressType, z, str, d, d2, immutableList, z2, shipmentOption, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShipmentOptionsRow$lambda$5(ShipmentOption shipmentOption, boolean z, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        ShipmentOptionsRow(shipmentOption, z, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShipmentOptionsRowLoading$lambda$15(Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShipmentOptionsRowLoading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SolidGoldOption$lambda$8(ShipmentOption shipmentOption, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SolidGoldOption(shipmentOption, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SolidGoldOptionLoading$lambda$18(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SolidGoldOptionLoading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean LogoImage$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShipmentOptions(final Function0<Unit> onEditAddress, final Function2<? super ShipmentOption, ? super Boolean, Unit> onContinue, final AddressType address, final boolean z, String str, Double d, Double d2, ImmutableList<ShipmentOption> immutableList, boolean z2, ShipmentOption shipmentOption, boolean z3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        String str2;
        int i6;
        Double d3;
        int i7;
        Double d4;
        int i8;
        final ImmutableList<ShipmentOption> immutableList2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ShipmentOption shipmentOption2;
        boolean z5;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        EventLogger eventLogger;
        SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        ShipmentOption shipmentOption3;
        final SnapshotState snapshotState3;
        boolean z6;
        boolean z7;
        Object objRememberedValue4;
        Composer composer2;
        final Double d5;
        final ImmutableList<ShipmentOption> immutableList3;
        final boolean z8;
        final boolean z9;
        final String str3;
        final ShipmentOption shipmentOption4;
        final Double d6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onEditAddress, "onEditAddress");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(address, "address");
        Composer composerStartRestartGroup = composer.startRestartGroup(1163310893);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(onEditAddress) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(address) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z4 = z;
                i4 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    str2 = str;
                    i4 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        d3 = d;
                        i4 |= composerStartRestartGroup.changed(d3) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        d4 = d2;
                    } else {
                        d4 = d2;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(d4) ? 1048576 : 524288;
                        }
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                        immutableList2 = immutableList;
                    } else {
                        immutableList2 = immutableList;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(immutableList2) ? 8388608 : 4194304;
                        }
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                        if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changedInstance(shipmentOption) ? 536870912 : 268435456;
                        }
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i13 = i12;
                            i14 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        if ((i4 & 306783379) == 306783378 && (i14 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z8 = z2;
                            immutableList3 = immutableList2;
                            composer2 = composerStartRestartGroup;
                            d5 = d4;
                            str3 = str2;
                            d6 = d3;
                            shipmentOption4 = shipmentOption;
                            z9 = z3;
                        } else {
                            if (i5 != 0) {
                                str2 = null;
                            }
                            if (i6 != 0) {
                                d3 = null;
                            }
                            Double d7 = i7 == 0 ? null : d4;
                            if (i8 != 0) {
                                immutableList2 = null;
                            }
                            final boolean z10 = i9 == 0 ? false : z2;
                            shipmentOption2 = i11 == 0 ? null : shipmentOption;
                            z5 = i13 == 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1163310893, i4, i14, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptions (ShipmentOptionsComposable.kt:87)");
                            }
                            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            int i15 = i14;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                                eventLogger = current;
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                eventLogger = current;
                            }
                            snapshotState2 = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            Boolean boolValueOf = Boolean.valueOf(z5);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = ((i15 & 14) != 4) | composerStartRestartGroup.changedInstance(immutableList2) | composerStartRestartGroup.changedInstance(shipmentOption2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                ShipmentOption shipmentOption5 = shipmentOption2;
                                boolean z11 = z5;
                                objRememberedValue3 = new ShipmentOptionsComposableKt$ShipmentOptions$1$1(immutableList2, snapshotState, shipmentOption5, snapshotState2, z11, null);
                                shipmentOption3 = shipmentOption5;
                                snapshotState3 = snapshotState2;
                                z6 = z11;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                shipmentOption3 = shipmentOption2;
                                z6 = z5;
                                snapshotState3 = snapshotState2;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ShipmentOption shipmentOption6 = shipmentOption3;
                            EffectsKt.LaunchedEffect(immutableList2, shipmentOption6, boolValueOf, (Function2) objRememberedValue3, composerStartRestartGroup, ((i15 << 6) & 896) | ((i4 >> 21) & 14) | ((i4 >> 24) & 112));
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            z7 = (57344 & i4) != 16384;
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z7 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new ShipmentOptionsComposableKt$ShipmentOptions$2$1(str2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(str2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (i4 >> 12) & 14);
                            Screen screen = new Screen(Screen.Name.CC_APPLICATION_SHIPPING_ADDRESS, null, null, null, 14, null);
                            final String str4 = str2;
                            int i16 = i4;
                            final boolean z12 = z4;
                            final EventLogger eventLogger2 = eventLogger;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1322683698, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt.ShipmentOptions.3
                                public final void invoke(Composer composer3, int i17) {
                                    SnapshotState<ShipmentOption> snapshotState4;
                                    SnapshotState<Boolean> snapshotState5;
                                    EventLogger eventLogger3;
                                    Function2<ShipmentOption, Boolean, Unit> function2;
                                    boolean z13;
                                    int i18;
                                    Composer composer4 = composer3;
                                    if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1322683698, i17, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptions.<anonymous> (ShipmentOptionsComposable.kt:108)");
                                    }
                                    if (immutableList2 != null) {
                                        SnapshotState<ShipmentOption> snapshotState6 = snapshotState;
                                        boolean z14 = z12;
                                        SnapshotState<Boolean> snapshotState7 = snapshotState3;
                                        String str5 = str4;
                                        EventLogger eventLogger4 = eventLogger2;
                                        Function2<ShipmentOption, Boolean, Unit> function22 = onContinue;
                                        boolean z15 = z10;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion2);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer4.startReplaceGroup(639081537);
                                        ShipmentOption value = snapshotState6.getValue();
                                        if (value == null || !value.getCanRequireSignature() || z14) {
                                            snapshotState4 = snapshotState6;
                                            snapshotState5 = snapshotState7;
                                            eventLogger3 = eventLogger4;
                                            function2 = function22;
                                            z13 = z15;
                                            i18 = 54;
                                        } else {
                                            snapshotState4 = snapshotState6;
                                            eventLogger3 = eventLogger4;
                                            function2 = function22;
                                            z13 = z15;
                                            snapshotState5 = snapshotState7;
                                            i18 = 54;
                                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoColor.INSTANCE.m21335getNightPrime0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1070828044, true, new ShipmentOptionsComposableKt$ShipmentOptions$3$1$1(snapshotState7, str5, eventLogger4), composer4, 54), composer3, 805306368, 510);
                                            composer4 = composer3;
                                        }
                                        composer4.endReplaceGroup();
                                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-952045583, true, new ShipmentOptionsComposableKt$ShipmentOptions$3$1$2(snapshotState4, eventLogger3, function2, z13, snapshotState5), composer4, i18), composer3, 805306368, 510);
                                        composer3.endNode();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composerStartRestartGroup, 54);
                            composer2 = composerStartRestartGroup;
                            SnapshotState snapshotState4 = snapshotState3;
                            Double d8 = d3;
                            ImmutableList<ShipmentOption> immutableList4 = immutableList2;
                            Double d9 = d7;
                            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(screen, null, str4, null, null, null, null, composableLambdaRememberComposableLambda, null, null, false, false, ComposableLambda3.rememberComposableLambda(884978401, true, new C125544(address, d8, d9, eventLogger2, onEditAddress, immutableList4, z, snapshotState, snapshotState4), composer2, 54), composer2, ((i16 >> 6) & 896) | 12582912, 384, 3962);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            d5 = d9;
                            immutableList3 = immutableList4;
                            z8 = z10;
                            z9 = z6;
                            str3 = str4;
                            shipmentOption4 = shipmentOption6;
                            d6 = d8;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ShipmentOptionsComposableKt.ShipmentOptions$lambda$4(onEditAddress, onContinue, address, z, str3, d6, d5, immutableList3, z8, shipmentOption4, z9, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
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
                    if ((i4 & 306783379) == 306783378) {
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        int i152 = i14;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 != companion.getEmpty()) {
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf2 = Boolean.valueOf(z5);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = ((i152 & 14) != 4) | composerStartRestartGroup.changedInstance(immutableList2) | composerStartRestartGroup.changedInstance(shipmentOption2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            ShipmentOption shipmentOption52 = shipmentOption2;
                            boolean z112 = z5;
                            objRememberedValue3 = new ShipmentOptionsComposableKt$ShipmentOptions$1$1(immutableList2, snapshotState, shipmentOption52, snapshotState2, z112, null);
                            shipmentOption3 = shipmentOption52;
                            snapshotState3 = snapshotState2;
                            z6 = z112;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            ShipmentOption shipmentOption62 = shipmentOption3;
                            EffectsKt.LaunchedEffect(immutableList2, shipmentOption62, boolValueOf2, (Function2) objRememberedValue3, composerStartRestartGroup, ((i152 << 6) & 896) | ((i4 >> 21) & 14) | ((i4 >> 24) & 112));
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if ((57344 & i4) != 16384) {
                            }
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z7) {
                                objRememberedValue4 = new ShipmentOptionsComposableKt$ShipmentOptions$2$1(str2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(str2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (i4 >> 12) & 14);
                                Screen screen2 = new Screen(Screen.Name.CC_APPLICATION_SHIPPING_ADDRESS, null, null, null, 14, null);
                                final String str42 = str2;
                                int i162 = i4;
                                final boolean z122 = z4;
                                final EventLogger eventLogger22 = eventLogger;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1322683698, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt.ShipmentOptions.3
                                    public final void invoke(Composer composer3, int i17) {
                                        SnapshotState<ShipmentOption> snapshotState42;
                                        SnapshotState<Boolean> snapshotState5;
                                        EventLogger eventLogger3;
                                        Function2<ShipmentOption, Boolean, Unit> function2;
                                        boolean z13;
                                        int i18;
                                        Composer composer4 = composer3;
                                        if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1322683698, i17, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptions.<anonymous> (ShipmentOptionsComposable.kt:108)");
                                        }
                                        if (immutableList2 != null) {
                                            SnapshotState<ShipmentOption> snapshotState6 = snapshotState;
                                            boolean z14 = z122;
                                            SnapshotState<Boolean> snapshotState7 = snapshotState3;
                                            String str5 = str42;
                                            EventLogger eventLogger4 = eventLogger22;
                                            Function2<ShipmentOption, Boolean, Unit> function22 = onContinue;
                                            boolean z15 = z10;
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion2);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            composer4.startReplaceGroup(639081537);
                                            ShipmentOption value = snapshotState6.getValue();
                                            if (value == null || !value.getCanRequireSignature() || z14) {
                                                snapshotState42 = snapshotState6;
                                                snapshotState5 = snapshotState7;
                                                eventLogger3 = eventLogger4;
                                                function2 = function22;
                                                z13 = z15;
                                                i18 = 54;
                                            } else {
                                                snapshotState42 = snapshotState6;
                                                eventLogger3 = eventLogger4;
                                                function2 = function22;
                                                z13 = z15;
                                                snapshotState5 = snapshotState7;
                                                i18 = 54;
                                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoColor.INSTANCE.m21335getNightPrime0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1070828044, true, new ShipmentOptionsComposableKt$ShipmentOptions$3$1$1(snapshotState7, str5, eventLogger4), composer4, 54), composer3, 805306368, 510);
                                                composer4 = composer3;
                                            }
                                            composer4.endReplaceGroup();
                                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-952045583, true, new ShipmentOptionsComposableKt$ShipmentOptions$3$1$2(snapshotState42, eventLogger3, function2, z13, snapshotState5), composer4, i18), composer3, 805306368, 510);
                                            composer3.endNode();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composerStartRestartGroup, 54);
                                composer2 = composerStartRestartGroup;
                                SnapshotState snapshotState42 = snapshotState3;
                                Double d82 = d3;
                                ImmutableList<ShipmentOption> immutableList42 = immutableList2;
                                Double d92 = d7;
                                CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(screen2, null, str42, null, null, null, null, composableLambdaRememberComposableLambda2, null, null, false, false, ComposableLambda3.rememberComposableLambda(884978401, true, new C125544(address, d82, d92, eventLogger22, onEditAddress, immutableList42, z, snapshotState, snapshotState42), composer2, 54), composer2, ((i162 >> 6) & 896) | 12582912, 384, 3962);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                d5 = d92;
                                immutableList3 = immutableList42;
                                z8 = z10;
                                z9 = z6;
                                str3 = str42;
                                shipmentOption4 = shipmentOption62;
                                d6 = d82;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                d3 = d;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str2 = str;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            d3 = d;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        d3 = d;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: ShipmentOptionsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$ShipmentOptions$4 */
    static final class C125544 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ AddressType $address;
        final /* synthetic */ SnapshotState<Boolean> $checked;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $isSolidGold;
        final /* synthetic */ Double $lat;
        final /* synthetic */ Double $long;
        final /* synthetic */ Function0<Unit> $onEditAddress;
        final /* synthetic */ ImmutableList<ShipmentOption> $options;
        final /* synthetic */ SnapshotState<ShipmentOption> $selectedOption;

        C125544(AddressType addressType, Double d, Double d2, EventLogger eventLogger, Function0<Unit> function0, ImmutableList<ShipmentOption> immutableList, boolean z, SnapshotState<ShipmentOption> snapshotState, SnapshotState<Boolean> snapshotState2) {
            this.$address = addressType;
            this.$lat = d;
            this.$long = d2;
            this.$eventLogger = eventLogger;
            this.$onEditAddress = function0;
            this.$options = immutableList;
            this.$isSolidGold = z;
            this.$selectedOption = snapshotState;
            this.$checked = snapshotState2;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            final SnapshotState<ShipmentOption> snapshotState;
            final SnapshotState<Boolean> snapshotState2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(884978401, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptions.<anonymous> (ShipmentOptionsComposable.kt:159)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), paddingValues), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), 0.0f, composer, 0, 1);
            AddressType addressType = this.$address;
            Double d = this.$lat;
            Double d2 = this.$long;
            final EventLogger eventLogger = this.$eventLogger;
            Function0<Unit> function0 = this.$onEditAddress;
            ImmutableList<ShipmentOption> immutableList = this.$options;
            boolean z = this.$isSolidGold;
            SnapshotState<ShipmentOption> snapshotState3 = this.$selectedOption;
            SnapshotState<Boolean> snapshotState4 = this.$checked;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion2, ShipmentOptionsComposableKt.SHIPMENT_OPTIONS_TITLE_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_options_title, composer, 0);
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            SnapshotState<Boolean> snapshotState5 = snapshotState4;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 48, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_options_subtitle, composer, 0), TestTag3.testTag(companion2, ShipmentOptionsComposableKt.SHIPMENT_OPTIONS_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 48, 0, 8124);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
            float f = 16;
            Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(Clip.clip(companion2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), bentoTheme.getColors(composer, i3).m21372getBg20d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4876borderxT4_qwU);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            AddressMapComposable.AddressMap(addressType, d, d2, ComposableLambda3.rememberComposableLambda(-984568539, true, new ShipmentOptionsComposableKt$ShipmentOptions$4$1$1$1(eventLogger, function0), composer, 54), composer, 3072, 0);
            composer.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), companion.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            if (immutableList != null) {
                composer.startReplaceGroup(1558849930);
                for (ShipmentOption shipmentOption : immutableList) {
                    if (z) {
                        composer.startReplaceGroup(-654794019);
                        ShipmentOptionsComposableKt.SolidGoldOption(shipmentOption, null, composer, 0, 2);
                        composer.endReplaceGroup();
                        snapshotState = snapshotState3;
                        snapshotState2 = snapshotState5;
                    } else {
                        composer.startReplaceGroup(-654676126);
                        ShipmentOption value = snapshotState3.getValue();
                        boolean zAreEqual = Intrinsics.areEqual(value != null ? value.getId() : null, shipmentOption.getId());
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(eventLogger);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            snapshotState = snapshotState3;
                            snapshotState2 = snapshotState5;
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$ShipmentOptions$4$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ShipmentOptionsComposableKt.C125544.invoke$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(eventLogger, snapshotState, snapshotState2, (ShipmentOption) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        } else {
                            snapshotState = snapshotState3;
                            snapshotState2 = snapshotState5;
                        }
                        composer.endReplaceGroup();
                        ShipmentOptionsComposableKt.ShipmentOptionsRow(shipmentOption, zAreEqual, null, (Function1) objRememberedValue, composer, 0, 4);
                        composer.endReplaceGroup();
                    }
                    snapshotState3 = snapshotState;
                    snapshotState5 = snapshotState2;
                }
                composer.endReplaceGroup();
            } else if (z) {
                composer.startReplaceGroup(1559939518);
                ShipmentOptionsComposableKt.SolidGoldOptionLoading(null, composer, 0, 1);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1560010539);
                ShipmentOptionsComposableKt.ShipmentOptionsRowLoading(null, composer, 0, 1);
                ShipmentOptionsComposableKt.ShipmentOptionsRowLoading(null, composer, 0, 1);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(EventLogger eventLogger, SnapshotState snapshotState, SnapshotState snapshotState2, ShipmentOption it) {
            Intrinsics.checkNotNullParameter(it, "it");
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, loggingUtils.getCcScreen(), new Component(Component.ComponentType.MENU_ITEM, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, it.getDeliveryMethod().getServerValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
            snapshotState.setValue(it);
            snapshotState2.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ShipmentOptionsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$ShipmentOptionsRow$1 */
    static final class C125551 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<ShipmentOption, Unit> $onOptionClicked;
        final /* synthetic */ ShipmentOption $option;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: Multi-variable type inference failed */
        C125551(Modifier modifier, boolean z, Function1<? super ShipmentOption, Unit> function1, ShipmentOption shipmentOption) {
            this.$modifier = modifier;
            this.$selected = z;
            this.$onOptionClicked = function1;
            this.$option = shipmentOption;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-660589674, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsRow.<anonymous> (ShipmentOptionsComposable.kt:263)");
            }
            Modifier modifier = this.$modifier;
            boolean z = this.$selected;
            Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c());
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onOptionClicked) | composer.changedInstance(this.$option);
            final Function1<ShipmentOption, Unit> function1 = this.$onOptionClicked;
            final ShipmentOption shipmentOption = this.$option;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$ShipmentOptionsRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShipmentOptionsComposableKt.C125551.invoke$lambda$1$lambda$0(function1, shipmentOption);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(Selectable3.m5316selectableXHw0xAI$default(modifier, z, false, roleM7472boximpl, Haptics.hapticClick((Function0) objRememberedValue, composer, 0), 2, null), this.$option.getId());
            final ShipmentOption shipmentOption2 = this.$option;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-933990318, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt.ShipmentOptionsRow.1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-933990318, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsRow.<anonymous>.<anonymous> (ShipmentOptionsComposable.kt:275)");
                    }
                    ShipmentOptionsComposableKt.LogoImage(shipmentOption2.getLogoUrl(), null, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            final ShipmentOption shipmentOption3 = this.$option;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1125932179, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt.ShipmentOptionsRow.1.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1125932179, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsRow.<anonymous>.<anonymous> (ShipmentOptionsComposable.kt:277)");
                    }
                    BentoText2.m20747BentoText38GnDrw(shipmentOption3.getName(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            final ShipmentOption shipmentOption4 = this.$option;
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1109112620, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt.ShipmentOptionsRow.1.4
                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1109112620, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsRow.<anonymous>.<anonymous> (ShipmentOptionsComposable.kt:283)");
                    }
                    ShipmentOption shipmentOption5 = shipmentOption4;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String description = shipmentOption5.getDescription();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(description, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextS(), composer2, 0, 0, 8190);
                    composer2.startReplaceGroup(1700163722);
                    if (shipmentOption5.getFeeAmountMicro() > 0.0d) {
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_options_charge_description, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextS(), composer2, 0, 0, 8186);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer, 54);
            final boolean z2 = this.$selected;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierTestTag, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, null, ComposableLambda3.rememberComposableLambda(-1284234922, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt.ShipmentOptionsRow.1.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1284234922, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsRow.<anonymous>.<anonymous> (ShipmentOptionsComposable.kt:298)");
                    }
                    BentoRadioButton2.BentoRadioButton(z2, null, true, composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), false, true, true, null, composer, 920153472, 0, 1058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, ShipmentOption shipmentOption) {
            function1.invoke(shipmentOption);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShipmentOptionsRow(final ShipmentOption option, final boolean z, Modifier modifier, final Function1<? super ShipmentOption, Unit> onOptionClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(onOptionClicked, "onOptionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1253051688);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(option) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onOptionClicked) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1253051688, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsRow (ShipmentOptionsComposable.kt:261)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-660589674, true, new C125551(modifier4, z, onOptionClicked, option), composerStartRestartGroup, 54), composer2, 805306368, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShipmentOptionsComposableKt.ShipmentOptionsRow$lambda$5(option, z, modifier3, onOptionClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-660589674, true, new C125551(modifier4, z, onOptionClicked, option), composerStartRestartGroup, 54), composer2, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SolidGoldOption(final ShipmentOption option, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(option, "option");
        Composer composerStartRestartGroup = composer.startRestartGroup(1743394219);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(option) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1743394219, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.SolidGoldOption (ShipmentOptionsComposable.kt:309)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                float f = 12;
                Modifier modifierTestTag = TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(modifier3, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), option.getId());
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                LogoImage(option.getLogoUrl(), null, composerStartRestartGroup, 0, 2);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_options_shipping_via, new Object[]{option.getCardDescription()}, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8186);
                BentoText2.m20747BentoText38GnDrw(option.getName(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 24576, 0, 8174);
                Divider5.m5851HorizontalDivider9IZ8Weo(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), composer2, 0, 2);
                BentoText2.m20747BentoText38GnDrw(option.getDescription(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8190);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShipmentOptionsComposableKt.SolidGoldOption$lambda$8(option, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            float f2 = 12;
            Modifier modifierTestTag2 = TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(modifier3, bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), option.getId());
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Horizontal start2 = arrangement2.getStart();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start2, companion4.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                LogoImage(option.getLogoUrl(), null, composerStartRestartGroup, 0, 2);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier42 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_options_shipping_via, new Object[]{option.getCardDescription()}, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, 0, 0, 8186);
                    BentoText2.m20747BentoText38GnDrw(option.getName(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextM(), composer2, 24576, 0, 8174);
                    Divider5.m5851HorizontalDivider9IZ8Weo(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, bentoTheme2.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, bentoTheme2.getColors(composer2, i52).m21373getBg30d7_KjU(), composer2, 0, 2);
                    BentoText2.m20747BentoText38GnDrw(option.getDescription(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, 0, 0, 8190);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LogoImage(final String logoUrl, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(165612189);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(logoUrl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(165612189, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.LogoImage (ShipmentOptionsComposable.kt:342)");
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
                ImageLoader imageLoader = Coil.imageLoader((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                ContentScale.Companion companion2 = ContentScale.INSTANCE;
                ContentScale fit = companion2.getFit();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShipmentOptionsComposableKt.LogoImage$lambda$13$lambda$12(snapshotState, (AsyncImagePainter.State) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AsyncImagePainter asyncImagePainterM9105rememberAsyncImagePainter0YpotYA = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(logoUrl, imageLoader, null, (Function1) objRememberedValue2, fit, 0, null, composerStartRestartGroup, (i3 & 14) | 27648, 100);
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ImageKt.Image(asyncImagePainterM9105rememberAsyncImagePainter0YpotYA, "delivery method image", ModifiersKt.bentoPlaceholder(SizeKt.m5169size3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(40)), LogoImage$lambda$10(snapshotState) || logoUrl.length() == 0, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12))), Alignment.INSTANCE.getCenterStart(), companion2.getFit(), 0.0f, (ColorFilter) null, composer2, 27696, 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShipmentOptionsComposableKt.LogoImage$lambda$14(logoUrl, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ImageLoader imageLoader2 = Coil.imageLoader((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            ContentScale.Companion companion22 = ContentScale.INSTANCE;
            ContentScale fit2 = companion22.getFit();
            composerStartRestartGroup.startReplaceGroup(5004770);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AsyncImagePainter asyncImagePainterM9105rememberAsyncImagePainter0YpotYA2 = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(logoUrl, imageLoader2, null, (Function1) objRememberedValue2, fit2, 0, null, composerStartRestartGroup, (i3 & 14) | 27648, 100);
            composer2 = composerStartRestartGroup;
            if (LogoImage$lambda$10(snapshotState2)) {
                modifier3 = modifier4;
                ImageKt.Image(asyncImagePainterM9105rememberAsyncImagePainter0YpotYA2, "delivery method image", ModifiersKt.bentoPlaceholder(SizeKt.m5169size3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(40)), LogoImage$lambda$10(snapshotState2) || logoUrl.length() == 0, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12))), Alignment.INSTANCE.getCenterStart(), companion22.getFit(), 0.0f, (ColorFilter) null, composer2, 27696, 96);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void LogoImage$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LogoImage$lambda$13$lambda$12(SnapshotState snapshotState, AsyncImagePainter.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LogoImage$lambda$11(snapshotState, it instanceof AsyncImagePainter.State.Success);
        return Unit.INSTANCE;
    }

    public static final void ShipmentOptionsRowLoading(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1549412386);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1549412386, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsRowLoading (ShipmentOptionsComposable.kt:366)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, SHIPMENT_OPTIONS_LOADING_ROW_TEST_TAG);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1850277342, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt.ShipmentOptionsRowLoading.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1850277342, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsRowLoading.<anonymous> (ShipmentOptionsComposable.kt:373)");
                    }
                    BoxKt.Box(ModifiersKt.bentoPlaceholder(SizeKt.m5169size3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(40)), true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12))), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableSingletons$ShipmentOptionsComposableKt composableSingletons$ShipmentOptionsComposableKt = ComposableSingletons$ShipmentOptionsComposableKt.INSTANCE;
            modifier3 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierTestTag, null, composableLambdaRememberComposableLambda, composableSingletons$ShipmentOptionsComposableKt.m12811getLambda$1645115425$feature_credit_card_externalDebug(), composableSingletons$ShipmentOptionsComposableKt.m12812getLambda$845540896$feature_credit_card_externalDebug(), null, composableSingletons$ShipmentOptionsComposableKt.getLambda$753608162$feature_credit_card_externalDebug(), false, true, true, null, composerStartRestartGroup, 920153478, 0, 1058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShipmentOptionsComposableKt.ShipmentOptionsRowLoading$lambda$15(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SolidGoldOptionLoading(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-8560876);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-8560876, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.SolidGoldOptionLoading (ShipmentOptionsComposable.kt:408)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            float f = 12;
            Modifier modifierTestTag = TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(modifier3, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), SHIPMENT_OPTIONS_SOLID_GOLD_LOADING_TEST_TAG);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BoxKt.Box(ModifiersKt.bentoPlaceholder(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(40)), true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), composerStartRestartGroup, 0);
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2 = composerStartRestartGroup;
            Modifier modifier4 = modifier3;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_options_shipping_via, composerStartRestartGroup, 0), TestTag3.testTag(ModifiersKt.bentoPlaceholder(companion3, true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), SHIPMENT_OPTIONS_SOLID_GOLD_LOADING_MESSAGE_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21597getXxsmallD9Ej5fM()), composer2, 0);
            BentoText2.m20747BentoText38GnDrw("FedEx Overnight", ModifiersKt.bentoPlaceholder(companion3, true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 24582, 0, 8172);
            Divider5.m5851HorizontalDivider9IZ8Weo(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), composer2, 0, 2);
            BentoText2.m20747BentoText38GnDrw("Estimated delivery on", ModifiersKt.bentoPlaceholder(companion3, true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 6, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21597getXxsmallD9Ej5fM()), composer2, 0);
            BentoText2.m20747BentoText38GnDrw("Delivery signature required", ModifiersKt.bentoPlaceholder(companion3, true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 6, 0, 8188);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShipmentOptionsComposableKt.SolidGoldOptionLoading$lambda$18(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
