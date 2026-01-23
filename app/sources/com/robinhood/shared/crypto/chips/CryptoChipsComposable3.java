package com.robinhood.shared.crypto.chips;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoChipsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$CryptoChipsComposable$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoChipsComposable3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<CryptoChipsComposable> $chips;
    final /* synthetic */ Context $context;
    final /* synthetic */ CryptoChipsEventLoggingState $eventLoggingState;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ CryptoChipsStyle $style;

    /* JADX WARN: Multi-variable type inference failed */
    CryptoChipsComposable3(ImmutableList<? extends CryptoChipsComposable> immutableList, Navigator navigator, Context context, CryptoChipsStyle cryptoChipsStyle, CryptoChipsEventLoggingState cryptoChipsEventLoggingState) {
        this.$chips = immutableList;
        this.$navigator = navigator;
        this.$context = context;
        this.$style = cryptoChipsStyle;
        this.$eventLoggingState = cryptoChipsEventLoggingState;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        char c;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456773299, i, -1, "com.robinhood.shared.crypto.chips.CryptoChipsComposable.<anonymous>.<anonymous>.<anonymous> (CryptoChipsComposable.kt:136)");
        }
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5092spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
        ImmutableList<CryptoChipsComposable> immutableList = this.$chips;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        CryptoChipsStyle cryptoChipsStyle = this.$style;
        CryptoChipsEventLoggingState cryptoChipsEventLoggingState = this.$eventLoggingState;
        Modifier.Companion companion = Modifier.INSTANCE;
        int i2 = 0;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5092spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(immutableList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IndexedValue indexedValue : iterableWithIndex) {
            Integer numValueOf = Integer.valueOf(indexedValue.getIndex() % 3);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add((CryptoChipsComposable) indexedValue.getValue());
        }
        Collection collectionValues = linkedHashMap.values();
        composer.startReplaceGroup(1911630359);
        Collection<List> collection = collectionValues;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (List list : collection) {
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5092spacedBy0680j_42 = Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21595getXsmallD9Ej5fM());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5092spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, i2);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, i2);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer.startReplaceGroup(-399583806);
            List<CryptoChipsComposable> list2 = list;
            char c2 = '\n';
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (CryptoChipsComposable cryptoChipsComposable : list2) {
                int iIndexOf = immutableList.indexOf(cryptoChipsComposable) + 1;
                if (cryptoChipsComposable instanceof CryptoChipsComposable.Loaded) {
                    composer.startReplaceGroup(-282827804);
                    CryptoChipsComposable.Loaded loaded = (CryptoChipsComposable.Loaded) cryptoChipsComposable;
                    char c3 = c2;
                    int size = immutableList.size();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$CryptoChipsComposable$1$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoChipsComposable3.invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$4$lambda$3(navigator, context, (CryptoChipsComposable) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    c = c3;
                    CryptoChipsComposable2.Chip(loaded, iIndexOf, size, (Function1) objRememberedValue, cryptoChipsStyle, cryptoChipsEventLoggingState, null, composer, 0, 64);
                    composer.endReplaceGroup();
                } else {
                    c = c2;
                    CryptoChipsComposable.Loading loading = CryptoChipsComposable.Loading.INSTANCE;
                    if (!Intrinsics.areEqual(cryptoChipsComposable, loading)) {
                        composer.startReplaceGroup(-424767143);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-281880072);
                    CryptoChipsComposable.Loaded placeholder$lib_crypto_chips_externalDebug = loading.getPlaceholder$lib_crypto_chips_externalDebug();
                    int size2 = immutableList.size();
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.chips.CryptoChipsComposableKt$CryptoChipsComposable$1$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoChipsComposable3.invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5((CryptoChipsComposable) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    CryptoChipsComposable2.Chip(placeholder$lib_crypto_chips_externalDebug, iIndexOf, size2, (Function1) objRememberedValue2, cryptoChipsStyle, cryptoChipsEventLoggingState, null, composer, 3078, 64);
                    composer.endReplaceGroup();
                }
                arrayList3.add(Unit.INSTANCE);
                c2 = c;
            }
            composer.endReplaceGroup();
            composer.endNode();
            arrayList2.add(Unit.INSTANCE);
            i2 = 0;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$4$lambda$3(Navigator navigator, Context context, CryptoChipsComposable clickedChip) {
        String deeplink;
        Intrinsics.checkNotNullParameter(clickedChip, "clickedChip");
        CryptoChipsComposable.Loaded loaded = clickedChip instanceof CryptoChipsComposable.Loaded ? (CryptoChipsComposable.Loaded) clickedChip : null;
        if (loaded != null && (deeplink = loaded.getDeeplink()) != null) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(deeplink), Boolean.TRUE, null, false, null, 56, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(CryptoChipsComposable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
