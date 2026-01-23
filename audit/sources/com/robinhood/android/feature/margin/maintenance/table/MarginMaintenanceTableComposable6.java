package com.robinhood.android.feature.margin.maintenance.table;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableState4;
import com.robinhood.android.generic.table.GenericChildRow;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.layout.GenericTableLayoutKt;
import com.robinhood.android.generic.table.layout.GenericTableLayoutScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginMaintenanceTableComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginMaintenanceTableComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ UserInteractionEventDescriptor $loggingDescriptor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<GenericChildRow<?>, Unit> $onChildRowClicked;
    final /* synthetic */ Function1<GenericRow<?>, Unit> $onRowClicked;
    final /* synthetic */ MarginMaintenanceTableState4.Success $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    MarginMaintenanceTableComposable6(Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor, LazyListState lazyListState, MarginMaintenanceTableState4.Success success, Function1<? super GenericRow<?>, Unit> function1, Function1<? super GenericChildRow<?>, Unit> function12) {
        this.$modifier = modifier;
        this.$loggingDescriptor = userInteractionEventDescriptor;
        this.$listState = lazyListState;
        this.$this_with = success;
        this.$onRowClicked = function1;
        this.$onChildRowClicked = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(MarginMaintenanceTableState4.Success success, Function1 function1, final Function1 function12, GenericTableLayoutScope GenericTableLayout) {
        Intrinsics.checkNotNullParameter(GenericTableLayout, "$this$GenericTableLayout");
        GenericTableLayout.item(MarginMaintenanceTableComposable3.HEADER_KEY, ComposableLambda3.composableLambdaInstance(1545641911, true, new MarginMaintenanceTableComposable7(success)));
        GenericTableLayoutScope.DefaultImpls.m14999tableY3c_0f4$default(GenericTableLayout, "equity-table", success.getTable(), null, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(52)), false, null, function1, new Function1() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$3$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMaintenanceTableComposable6.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function12, (GenericChildRow) obj);
            }
        }, MarginMaintenanceTableComposable.INSTANCE.m2018x3b26ea84(), 52, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, GenericChildRow action) {
        Intrinsics.checkNotNullParameter(action, "action");
        function1.invoke(action);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1246657700, i, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposable.<anonymous>.<anonymous> (MarginMaintenanceTableComposable.kt:63)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(this.$modifier, this.$loggingDescriptor, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null);
        LazyListState lazyListState = this.$listState;
        final MarginMaintenanceTableState4.Success success = this.$this_with;
        final Function1<GenericRow<?>, Unit> function1 = this.$onRowClicked;
        final Function1<GenericChildRow<?>, Unit> function12 = this.$onChildRowClicked;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(success) | composer.changed(function1) | composer.changed(function12);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMaintenanceTableComposable6.invoke$lambda$3$lambda$2$lambda$1(success, function1, function12, (GenericTableLayoutScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        GenericTableLayoutKt.GenericTableLayout(modifierFillMaxSize$default2, lazyListState, null, (Function1) objRememberedValue, composer, 6, 4);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
