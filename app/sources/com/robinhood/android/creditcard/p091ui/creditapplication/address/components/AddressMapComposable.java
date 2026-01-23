package com.robinhood.android.creditcard.p091ui.creditapplication.address.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.MapUiSettings;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.compose.maps.StyleableMapComposable3;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.components.AddressMapComposable;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddressMapComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a?\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u000f\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", PlaceTypes.ADDRESS, "", "latitude", "longitude", "Lkotlin/Function0;", "", "content", "AddressMap", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "ADDRESS_MAP_TEST_TAG", "Ljava/lang/String;", "ADDRESS_MAP_PLACEHOLDER_TEST_TAG", "ADDRESS_MAP_PRIMARY_ELEMENT_TEST_TAG", "ADDRESS_MAP_SECONDARY_ELEMENT_TEST_TAG", "", "mapLoaded", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMapComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AddressMapComposable {
    public static final String ADDRESS_MAP_PLACEHOLDER_TEST_TAG = "address-map-placeholder-test-tag";
    public static final String ADDRESS_MAP_PRIMARY_ELEMENT_TEST_TAG = "address-map-primary-element";
    public static final String ADDRESS_MAP_SECONDARY_ELEMENT_TEST_TAG = "address-map-secondary-element";
    public static final String ADDRESS_MAP_TEST_TAG = "address-map-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressMap$lambda$4(AddressType addressType, Double d, Double d2, Function2 function2, int i, int i2, Composer composer, int i3) {
        AddressMap(addressType, d, d2, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressMap(final AddressType address, Double d, Double d2, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Double d3;
        int i4;
        Double d4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        LatLng latLng;
        final Double d5;
        Object objRememberedValue;
        final Double d6;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(address, "address");
        Composer composerStartRestartGroup = composer.startRestartGroup(1602028562);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(address) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                d3 = d;
                i3 |= composerStartRestartGroup.changed(d3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    d4 = d2;
                    i3 |= composerStartRestartGroup.changed(d4) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function22 = function2;
                        i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        latLng = null;
                        if (i6 != 0) {
                            d3 = null;
                        }
                        d5 = i4 == 0 ? null : d4;
                        Function2<? super Composer, ? super Integer, Unit> function2M12638getLambda$1448764417$feature_credit_card_externalDebug = i5 == 0 ? AddressMapComposable3.INSTANCE.m12638getLambda$1448764417$feature_credit_card_externalDebug() : function22;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1602028562, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMap (AddressMapComposable.kt:41)");
                        }
                        if (d3 != null && d5 != null) {
                            latLng = new LatLng(d3.doubleValue(), d5.doubleValue());
                        }
                        LatLng latLng2 = latLng;
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMapComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AddressMapComposable.AddressMap$lambda$1$lambda$0();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        Boolean bool = Boolean.FALSE;
                        Boolean bool2 = Boolean.TRUE;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1420521930, true, new C122561(function2M12638getLambda$1448764417$feature_credit_card_externalDebug, latLng2, snapshotState, address), composerStartRestartGroup, 54);
                        Function2<? super Composer, ? super Integer, Unit> function24 = function2M12638getLambda$1448764417$feature_credit_card_externalDebug;
                        BentoTheme2.BentoTheme(bool, null, bool2, null, null, null, null, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 100663686, 250);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        d6 = d3;
                        function23 = function24;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        d6 = d3;
                        d5 = d4;
                        function23 = function22;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMapComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AddressMapComposable.AddressMap$lambda$4(address, d6, d5, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function22 = function2;
                if ((i3 & 1171) == 1170) {
                    latLng = null;
                    if (i6 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (d3 != null) {
                        latLng = new LatLng(d3.doubleValue(), d5.doubleValue());
                    }
                    LatLng latLng22 = latLng;
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    Boolean bool3 = Boolean.FALSE;
                    Boolean bool22 = Boolean.TRUE;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1420521930, true, new C122561(function2M12638getLambda$1448764417$feature_credit_card_externalDebug, latLng22, snapshotState2, address), composerStartRestartGroup, 54);
                    Function2<? super Composer, ? super Integer, Unit> function242 = function2M12638getLambda$1448764417$feature_credit_card_externalDebug;
                    BentoTheme2.BentoTheme(bool3, null, bool22, null, null, null, null, null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 100663686, 250);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    d6 = d3;
                    function23 = function242;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            d4 = d2;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function22 = function2;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        d3 = d;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        d4 = d2;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function22 = function2;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState AddressMap$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AddressMap$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: AddressMapComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMapComposableKt$AddressMap$1 */
    static final class C122561 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AddressType $address;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ LatLng $latlng;
        final /* synthetic */ SnapshotState<Boolean> $mapLoaded$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C122561(Function2<? super Composer, ? super Integer, Unit> function2, LatLng latLng, SnapshotState<Boolean> snapshotState, AddressType addressType) {
            this.$content = function2;
            this.$latlng = latLng;
            this.$mapLoaded$delegate = snapshotState;
            this.$address = addressType;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$3$lambda$0(LatLng latLng, CameraPositionState rememberCameraPositionState) {
            Intrinsics.checkNotNullParameter(rememberCameraPositionState, "$this$rememberCameraPositionState");
            CameraPosition cameraPositionFromLatLngZoom = CameraPosition.fromLatLngZoom(latLng, 15.0f);
            Intrinsics.checkNotNullExpressionValue(cameraPositionFromLatLngZoom, "fromLatLngZoom(...)");
            rememberCameraPositionState.setPosition(cameraPositionFromLatLngZoom);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$3$lambda$2$lambda$1(SnapshotState snapshotState) {
            AddressMapComposable.AddressMap$lambda$3(snapshotState, true);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            SnapshotState<Boolean> snapshotState;
            AddressType addressType;
            Modifier.Companion companion;
            BentoTheme bentoTheme;
            int i2;
            Function2<Composer, Integer, Unit> function2;
            Object obj;
            boolean z;
            int i3;
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1420521930, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMap.<anonymous> (AddressMapComposable.kt:51)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 16;
            Modifier modifierClip = Clip.clip(companion2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)));
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme2.getColors(composer2, i4).m21372getBg20d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer2, i4).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)));
            Function2<Composer, Integer, Unit> function22 = this.$content;
            final LatLng latLng = this.$latlng;
            final SnapshotState<Boolean> snapshotState2 = this.$mapLoaded$delegate;
            AddressType addressType2 = this.$address;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4876borderxT4_qwU);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceGroup(2088378152);
            if (latLng != null) {
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), AddressMapComposable.ADDRESS_MAP_TEST_TAG);
                MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, false, false, false, false, false);
                final Function1 function1 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMapComposableKt$AddressMap$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AddressMapComposable.C122561.invoke$lambda$6$lambda$3$lambda$0(latLng, (CameraPositionState) obj2);
                    }
                };
                composer2.startReplaceableGroup(-1911106014);
                addressType = addressType2;
                CameraPositionState cameraPositionState = (CameraPositionState) RememberSaveable.m6426rememberSaveable(new Object[0], (Saver) CameraPositionState.INSTANCE.getSaver(), (String) null, (Function0) new Function0<CameraPositionState>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMapComposableKt$AddressMap$1$invoke$lambda$6$lambda$3$$inlined$rememberCameraPositionState$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final CameraPositionState invoke() {
                        CameraPositionState cameraPositionState2 = new CameraPositionState(null, 1, null);
                        function1.invoke(cameraPositionState2);
                        return cameraPositionState2;
                    }
                }, composer2, 72, 0);
                composer2.endReplaceableGroup();
                composer2.startReplaceGroup(5004770);
                boolean zChanged = composer2.changed(snapshotState2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMapComposableKt$AddressMap$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddressMapComposable.C122561.invoke$lambda$6$lambda$3$lambda$2$lambda$1(snapshotState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                snapshotState = snapshotState2;
                i2 = i4;
                companion = companion2;
                bentoTheme = bentoTheme2;
                function2 = function22;
                StyleableMapComposable3.StyleableMapComposable(modifierTestTag, cameraPositionState, null, null, null, null, mapUiSettings, null, null, null, (Function0) objRememberedValue, null, null, null, null, false, ComposableLambda3.rememberComposableLambda(-120562871, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMapComposableKt$AddressMap$1$1$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-120562871, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.components.AddressMap.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressMapComposable.kt:91)");
                        }
                        MarkerKt.m9322Markerqld6geY(MarkerKt.rememberMarkerState(null, latLng, composer3, 0, 1), null, 0.0f, 0L, false, true, null, 0L, 0.0f, null, null, null, false, 0.0f, null, null, null, null, composer3, MarkerState.$stable | 221184, 0, 262094);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer, (CameraPositionState.$stable << 3) | 6 | (MapUiSettings.$stable << 18), 1769472, 31676);
                composer2 = composer;
            } else {
                snapshotState = snapshotState2;
                addressType = addressType2;
                companion = companion2;
                bentoTheme = bentoTheme2;
                i2 = i4;
                function2 = function22;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(2088427705);
            if (AddressMapComposable.AddressMap$lambda$2(snapshotState)) {
                obj = null;
                z = true;
                i3 = 0;
            } else {
                obj = null;
                z = true;
                i3 = 0;
                BoxKt.Box(TestTag3.testTag(ModifiersKt.bentoPlaceholder$default(OffsetKt.m5123absoluteOffsetVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 3, null), true, null, 2, null), AddressMapComposable.ADDRESS_MAP_PLACEHOLDER_TEST_TAG), composer2, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            BentoTheme bentoTheme3 = bentoTheme;
            int i5 = i2;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme3.getSpacing(composer2, i5).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, i3);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, i3);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(addressType.getPrimaryAddressLine() + PlaceholderUtils.XXShortPlaceholderText + addressType.getSecondaryAddressLine(), TestTag3.testTag(companion, AddressMapComposable.ADDRESS_MAP_PRIMARY_ELEMENT_TEST_TAG), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i5).getTextM(), composer2, 24624, 0, 8172);
            Modifier modifierTestTag2 = TestTag3.testTag(companion, AddressMapComposable.ADDRESS_MAP_SECONDARY_ELEMENT_TEST_TAG);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(addressType.getLocality());
            builder.append(", ");
            builder.append(addressType.getSubdivision());
            builder.append(PlaceholderUtils.XXShortPlaceholderText);
            builder.append(addressType.getZip());
            BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), modifierTestTag2, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme3.getTypography(composer2, i5).getTextS(), composer2, 48, 0, 8188);
            composer2.endNode();
            function2.invoke(composer2, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AddressMap$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
