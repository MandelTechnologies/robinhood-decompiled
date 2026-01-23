package com.robinhood.shared.crypto.movers;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.crypto.movers.CryptoCardsComposable;
import com.robinhood.shared.crypto.movers.CryptoDailyMoversViewState;
import com.robinhood.shared.crypto.movers.InstrumentPreviewCard4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoCardsComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a7\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"CryptoCardsComposable", "", "location", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "cards", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InternalCryptoCardsComposable", "isPreview", "", "(Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "CryptoCardsPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-movers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoCardsComposable {

    /* compiled from: CryptoCardsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiCryptoTradingOptions3.values().length];
            try {
                iArr[ApiCryptoTradingOptions3.COMPACT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoTradingOptionsLocation.values().length];
            try {
                iArr2[CryptoTradingOptionsLocation.TRENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCardsComposable$lambda$0(CryptoTradingOptionsLocation cryptoTradingOptionsLocation, ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoCardsComposable(cryptoTradingOptionsLocation, immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCardsPreview$lambda$12(int i, Composer composer, int i2) {
        CryptoCardsPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalCryptoCardsComposable$lambda$11(CryptoTradingOptionsLocation cryptoTradingOptionsLocation, ImmutableList immutableList, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        InternalCryptoCardsComposable(cryptoTradingOptionsLocation, immutableList, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoCardsComposable(CryptoTradingOptionsLocation location, ImmutableList<? extends InstrumentPreviewCard4> cards, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final CryptoTradingOptionsLocation cryptoTradingOptionsLocation;
        final ImmutableList<? extends InstrumentPreviewCard4> immutableList;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1929084147);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(location.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(cards) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            immutableList = cards;
            cryptoTradingOptionsLocation = location;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1929084147, i3, -1, "com.robinhood.shared.crypto.movers.CryptoCardsComposable (CryptoCardsComposable.kt:37)");
            }
            InternalCryptoCardsComposable(location, cards, modifier3, false, composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896), 0);
            cryptoTradingOptionsLocation = location;
            immutableList = cards;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoCardsComposable.CryptoCardsComposable$lambda$0(cryptoTradingOptionsLocation, immutableList, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalCryptoCardsComposable(final CryptoTradingOptionsLocation cryptoTradingOptionsLocation, final ImmutableList<? extends InstrumentPreviewCard4> immutableList, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final ImmutableList<? extends InstrumentPreviewCard4> immutableList2;
        Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Context context;
        final Navigator navigator;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean z4;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(629720684);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(cryptoTradingOptionsLocation.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            immutableList2 = immutableList;
        } else {
            immutableList2 = immutableList;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(immutableList2) ? 32 : 16;
            }
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(629720684, i3, -1, "com.robinhood.shared.crypto.movers.InternalCryptoCardsComposable (CryptoCardsComposable.kt:50)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Modifier modifier5 = modifier4;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Function1 function1 = new Function1() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoCardsComposable.InternalCryptoCardsComposable$lambda$10$lambda$9$lambda$8(immutableList2, z3, navigator, context, cryptoTradingOptionsLocation, (LazyListScope) obj);
                            }
                        };
                        z4 = z3;
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue = function1;
                    } else {
                        z4 = z3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    LazyDslKt.LazyRow(companion2, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer2, 6, 490);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z5 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoCardsComposable.InternalCryptoCardsComposable$lambda$11(cryptoTradingOptionsLocation, immutableList, modifier3, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Modifier modifier52 = modifier4;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        Function1 function12 = new Function1() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoCardsComposable.InternalCryptoCardsComposable$lambda$10$lambda$9$lambda$8(immutableList2, z3, navigator, context, cryptoTradingOptionsLocation, (LazyListScope) obj);
                            }
                        };
                        z4 = z3;
                        composerStartRestartGroup.updateRememberedValue(function12);
                        objRememberedValue = function12;
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyRow(companion22, null, paddingValuesM5137PaddingValuesYgX7TsA$default2, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue, composer2, 6, 490);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        z5 = z4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @DayNightPreview
    public static final void CryptoCardsPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1651466444);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1651466444, i, -1, "com.robinhood.shared.crypto.movers.CryptoCardsPreview (CryptoCardsComposable.kt:138)");
            }
            final ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new InstrumentPreviewCard4.Loaded(extensions2.persistentListOf(), Direction.f5855UP, "+1.23%", "$123.45", ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "Bitcoin", null, 64, null), new InstrumentPreviewCard4.Loaded(extensions2.persistentListOf(), Direction.DOWN, "-0.25%", "$456.32", "ETH", "Ethereum", null, 64, null));
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), ComposableLambda3.rememberComposableLambda(-1799187060, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt.CryptoCardsPreview.1
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
                        ComposerKt.traceEventStart(-1799187060, i2, -1, "com.robinhood.shared.crypto.movers.CryptoCardsPreview.<anonymous> (CryptoCardsComposable.kt:160)");
                    }
                    Boolean boolValueOf = Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composer2, 0));
                    final ImmutableList3<InstrumentPreviewCard4.Loaded> immutableList3 = immutableList3PersistentListOf;
                    BentoTheme2.BentoTheme(boolValueOf, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-885820604, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt.CryptoCardsPreview.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-885820604, i3, -1, "com.robinhood.shared.crypto.movers.CryptoCardsPreview.<anonymous>.<anonymous> (CryptoCardsComposable.kt:161)");
                            }
                            CryptoCardsComposable.InternalCryptoCardsComposable(CryptoTradingOptionsLocation.DAILY_MOVERS, immutableList3, null, true, composer3, 3078, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoCardsComposable.CryptoCardsPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalCryptoCardsComposable$lambda$10$lambda$9$lambda$8(final ImmutableList immutableList, final boolean z, final Navigator navigator, final Context context, final CryptoTradingOptionsLocation cryptoTradingOptionsLocation, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final C37722xd1893ad4 c37722xd1893ad4 = new Function1() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$InternalCryptoCardsComposable$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(InstrumentPreviewCard4 instrumentPreviewCard4) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((InstrumentPreviewCard4) obj);
            }
        };
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$InternalCryptoCardsComposable$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c37722xd1893ad4.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$InternalCryptoCardsComposable$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                float fM7995constructorimpl;
                String string2;
                String serverValue;
                String serverValue2;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                boolean z2 = false;
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final InstrumentPreviewCard4 instrumentPreviewCard4 = (InstrumentPreviewCard4) immutableList.get(i);
                composer.startReplaceGroup(1187582896);
                composer.startReplaceGroup(1562347785);
                Modifier.Companion companion = Modifier.INSTANCE;
                ApiCryptoTradingOptions3 style = instrumentPreviewCard4.getStyle();
                float fM7995constructorimpl2 = (style == null ? -1 : CryptoCardsComposable.WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) : C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
                ApiCryptoTradingOptions3 style2 = instrumentPreviewCard4.getStyle();
                if ((style2 != null ? CryptoCardsComposable.WhenMappings.$EnumSwitchMapping$0[style2.ordinal()] : -1) != 1) {
                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
                } else {
                    fM7995constructorimpl = C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM();
                }
                Modifier modifierM5175widthInVpY3zN4 = SizeKt.m5175widthInVpY3zN4(companion, fM7995constructorimpl2, fM7995constructorimpl);
                if (!z && !(instrumentPreviewCard4 instanceof InstrumentPreviewCard4.Loading)) {
                    z2 = true;
                }
                if (z2) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType = Component.ComponentType.CARD;
                    if (CryptoCardsComposable.WhenMappings.$EnumSwitchMapping$1[cryptoTradingOptionsLocation.ordinal()] == 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(instrumentPreviewCard4.getSubtitle());
                        ApiCryptoTradingOptions3 style3 = instrumentPreviewCard4.getStyle();
                        if (style3 != null && (serverValue2 = style3.getServerValue()) != null) {
                            sb.append('-');
                            sb.append(StringsKt.replace$default(serverValue2, '_', '-', false, 4, (Object) null));
                            Unit unit = Unit.INSTANCE;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        string2 = sb.toString();
                    } else {
                        string2 = "daily-movers-card-" + instrumentPreviewCard4.getSubtitle();
                    }
                    Component component = new Component(componentType, string2, null, 4, null);
                    Component.ComponentType componentType2 = Component.ComponentType.LIST_CAROUSEL;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(StringsKt.replace$default(cryptoTradingOptionsLocation.getServerValue(), '_', '-', false, 4, (Object) null));
                    sb2.append('-');
                    ApiCryptoTradingOptions3 style4 = instrumentPreviewCard4.getStyle();
                    if (style4 != null && (serverValue = style4.getServerValue()) != null) {
                        sb2.append(StringsKt.replace$default(serverValue, '_', '-', false, 4, (Object) null));
                        sb2.append('-');
                    }
                    sb2.append("section");
                    Unit unit3 = Unit.INSTANCE;
                    modifierM5175widthInVpY3zN4 = modifierM5175widthInVpY3zN4.then(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, new com.robinhood.rosetta.eventlogging.Context(immutableList.indexOf(instrumentPreviewCard4) + 1, immutableList.size(), 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -1, -1, -1, 16383, null), component, new ComponentHierarchy(new Component(componentType2, sb2.toString(), null, 4, null), null, null, null, null, 30, null), 7, null), true, false, false, true, false, null, 108, null));
                }
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(instrumentPreviewCard4) | composer.changedInstance(navigator) | composer.changedInstance(context);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Navigator navigator2 = navigator;
                    final Context context2 = context;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.crypto.movers.CryptoCardsComposableKt$InternalCryptoCardsComposable$1$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            InstrumentPreviewCard4 instrumentPreviewCard42 = instrumentPreviewCard4;
                            if (instrumentPreviewCard42 instanceof CryptoDailyMoversViewState.CryptoCard) {
                                Uri deeplinkUri = ((CryptoDailyMoversViewState.CryptoCard) instrumentPreviewCard42).getDeeplinkUri();
                                if (navigator2.isDeepLinkSupported(deeplinkUri)) {
                                    Navigator.DefaultImpls.handleDeepLink$default(navigator2, context2, deeplinkUri, ((CryptoDailyMoversViewState.CryptoCard) instrumentPreviewCard4).getShouldClearTopOnDeeplinkHandling(), null, false, null, 56, null);
                                }
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                InstrumentPreviewCard3.InstrumentPreviewCard(instrumentPreviewCard4, modifierM5175widthInVpY3zN4, (Function0) objRememberedValue, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
