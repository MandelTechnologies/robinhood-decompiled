package com.robinhood.android.crypto.costbasis.details.entry;

import android.view.KeyEvent;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.BackHandler;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt;
import com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryEvent;
import com.robinhood.android.crypto.costbasis.details.entry.InputRow;
import com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDetails;
import com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDialog;
import com.robinhood.android.crypto.costbasis.utils.CostBasisLoggingUtils;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayoutV2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRow;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRow8;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowStyle;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoCostBasisEntryComposable.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a§\u0001\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2:\u0010\u000e\u001a6\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0014j\u0002`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u00182'\u0010\u0019\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00010\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001c\u001a5\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\"\u001a3\u0010#\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010'¨\u0006(²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0012\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u008a\u0084\u0002²\u0006\f\u0010,\u001a\u0004\u0018\u00010-X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020 X\u008a\u0084\u0002²\u0006\f\u00100\u001a\u0004\u0018\u000101X\u008a\u008e\u0002"}, m3636d2 = {"CryptoCostBasisEntryComposable", "", "args", "Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;", "exit", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo;", "(Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoCostBasisEntryComposableContent", "state", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryViewState;", "consumeKeyEvent", "Lkotlin/Function2;", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;", "Lkotlin/ParameterName;", "name", "focusedRow", "Landroid/view/KeyEvent;", "keyEvent", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "validateInput", "Lkotlin/Function1;", "submitInput", "Lkotlinx/collections/immutable/ImmutableList;", "inputRows", "(Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryViewState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InputRow", "inputRow", "isFocused", "", "onFocusRequested", "(Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UnsavedChangeDialog", "dismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-cost-basis_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent;", "errorResponse", "Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;", "showUnsavedChangeWarning", "hasUnsavedChanges", "focusedRowType", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow$Type;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoCostBasisEntryComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisEntryComposable$lambda$16(CostBasisEntryArgs costBasisEntryArgs, Function0 function0, Modifier modifier, CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, int i, int i2, Composer composer, int i3) {
        CryptoCostBasisEntryComposable(costBasisEntryArgs, function0, modifier, cryptoCostBasisEntryDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisEntryComposableContent$lambda$17(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, Function2 function2, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoCostBasisEntryComposableContent(cryptoCostBasisEntryViewState, function2, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputRow$lambda$22(InputRow inputRow, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InputRow(inputRow, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$28(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnsavedChangeDialog$lambda$27(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UnsavedChangeDialog(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoCostBasisEntryComposable(final CostBasisEntryArgs args, final Function0<Unit> exit, Modifier modifier, CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo2;
        int i4;
        Modifier modifier3;
        CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo3;
        int i5;
        Event<CryptoCostBasisEntryEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        final CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo4;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1278700213);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(exit) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoCostBasisEntryDuxo2 = cryptoCostBasisEntryDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(cryptoCostBasisEntryDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    cryptoCostBasisEntryDuxo2 = cryptoCostBasisEntryDuxo;
                }
                i3 |= i7;
            } else {
                cryptoCostBasisEntryDuxo2 = cryptoCostBasisEntryDuxo;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoCostBasisEntryDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        int i8 = i4 & (-7169);
                        cryptoCostBasisEntryDuxo3 = (CryptoCostBasisEntryDuxo) baseDuxo;
                        i5 = i8;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1278700213, i5, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposable (CryptoCostBasisEntryComposable.kt:80)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisEntryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<CryptoCostBasisEntryEvent>> eventFlow = cryptoCostBasisEntryDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoCostBasisEntryComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof CryptoCostBasisEntryEvent) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Event<CryptoCostBasisEntryEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof CryptoCostBasisEntryEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(coroutineContextImpl6, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$10$lambda$9(snapshotState4CollectAsStateWithLifecycle));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UUID.randomUUID();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    UUID uuid = (UUID) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
                    boolean zCryptoCostBasisEntryComposable$lambda$11 = CryptoCostBasisEntryComposable$lambda$11(snapshotState4);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$15$lambda$14(snapshotState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandler.BackHandler(zCryptoCostBasisEntryComposable$lambda$11, (Function0) objRememberedValue6, composerStartRestartGroup, 48, 0);
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    Object[] objArr2 = 0 == true ? 1 : 0;
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_COST_BASIS_INPUT, null, null, null, 14, null), null, new Context(0, 0, 0, str, null, null, str2, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, str3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, objArr2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(null, Uuids.toStringOrEmpty(uuid), str, 0.0d, str2, null, null, null, null, Uuids.toStringOrEmpty(args.getSourceId()), null, str3, null, null, 15869, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null);
                    cryptoCostBasisEntryDuxo4 = cryptoCostBasisEntryDuxo3;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1504786560, true, new C128102(coroutineScope, cryptoCostBasisEntryDuxo4, modifier5, exit, snapshotState4CollectAsStateWithLifecycle, snapshotState, snapshotState2, snapshotState4CollectAsStateWithLifecycle2), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i5 = i4;
                cryptoCostBasisEntryDuxo3 = cryptoCostBasisEntryDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisEntryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoCostBasisEntryDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoCostBasisEntryComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof CryptoCostBasisEntryEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<CryptoCostBasisEntryEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof CryptoCostBasisEntryEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr3 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                UUID uuid2 = (UUID) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
                boolean zCryptoCostBasisEntryComposable$lambda$112 = CryptoCostBasisEntryComposable$lambda$11(snapshotState42);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandler.BackHandler(zCryptoCostBasisEntryComposable$lambda$112, (Function0) objRememberedValue6, composerStartRestartGroup, 48, 0);
                String str4 = null;
                String str22 = null;
                String str32 = null;
                Object[] objArr22 = 0 == true ? 1 : 0;
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_COST_BASIS_INPUT, null, null, null, 14, null), null, new Context(0, 0, 0, str4, null, null, str22, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, str32, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, objArr22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(null, Uuids.toStringOrEmpty(uuid2), str4, 0.0d, str22, null, null, null, null, Uuids.toStringOrEmpty(args.getSourceId()), null, str32, null, null, 15869, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null);
                cryptoCostBasisEntryDuxo4 = cryptoCostBasisEntryDuxo3;
                composer2 = composerStartRestartGroup;
                Modifier modifier52 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor2, ComposableLambda3.rememberComposableLambda(1504786560, true, new C128102(coroutineScope2, cryptoCostBasisEntryDuxo4, modifier52, exit, snapshotState4CollectAsStateWithLifecycle3, snapshotState3, snapshotState22, snapshotState4CollectAsStateWithLifecycle22), composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoCostBasisEntryDuxo4 = cryptoCostBasisEntryDuxo2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$16(args, exit, modifier4, cryptoCostBasisEntryDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i5 = i4;
                    cryptoCostBasisEntryDuxo3 = cryptoCostBasisEntryDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(cryptoCostBasisEntryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow22 = cryptoCostBasisEntryDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoCostBasisEntryComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof CryptoCostBasisEntryEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<CryptoCostBasisEntryEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof CryptoCostBasisEntryEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                CoroutineScope coroutineScope22 = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                SnapshotState snapshotState32 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final SnapshotState snapshotState222 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr32 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                UUID uuid22 = (UUID) RememberSaveable.m6426rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
                boolean zCryptoCostBasisEntryComposable$lambda$1122 = CryptoCostBasisEntryComposable$lambda$11(snapshotState422);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandler.BackHandler(zCryptoCostBasisEntryComposable$lambda$1122, (Function0) objRememberedValue6, composerStartRestartGroup, 48, 0);
                String str42 = null;
                String str222 = null;
                String str322 = null;
                Object[] objArr222 = 0 == true ? 1 : 0;
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_COST_BASIS_INPUT, null, null, null, 14, null), null, new Context(0, 0, 0, str42, null, null, str222, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, str322, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, objArr222, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(null, Uuids.toStringOrEmpty(uuid22), str42, 0.0d, str222, null, null, null, null, Uuids.toStringOrEmpty(args.getSourceId()), null, str322, null, null, 15869, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null);
                cryptoCostBasisEntryDuxo4 = cryptoCostBasisEntryDuxo3;
                composer2 = composerStartRestartGroup;
                Modifier modifier522 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor22, ComposableLambda3.rememberComposableLambda(1504786560, true, new C128102(coroutineScope22, cryptoCostBasisEntryDuxo4, modifier522, exit, snapshotState4CollectAsStateWithLifecycle32, snapshotState32, snapshotState222, snapshotState4CollectAsStateWithLifecycle222), composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoCostBasisEntryViewState CryptoCostBasisEntryComposable$lambda$0(SnapshotState4<CryptoCostBasisEntryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<CryptoCostBasisEntryEvent> CryptoCostBasisEntryComposable$lambda$1(SnapshotState4<Event<CryptoCostBasisEntryEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean CryptoCostBasisEntryComposable$lambda$11(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CostBasisErrorDetails CryptoCostBasisEntryComposable$lambda$3(SnapshotState<CostBasisErrorDetails> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoCostBasisEntryComposable$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoCostBasisEntryComposable$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoCostBasisEntryComposable$lambda$10$lambda$9(SnapshotState4 snapshotState4) {
        ImmutableList<InputRow> inputRows = CryptoCostBasisEntryComposable$lambda$0(snapshotState4).getInputRows();
        if (inputRows != null && inputRows.isEmpty()) {
            return false;
        }
        Iterator<InputRow> it = inputRows.iterator();
        while (it.hasNext()) {
            if (it.next().getValue().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCostBasisEntryComposable$lambda$15$lambda$14(SnapshotState snapshotState) {
        CryptoCostBasisEntryComposable$lambda$7(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoCostBasisEntryComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2 */
    static final class C128102 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoCostBasisEntryDuxo $duxo;
        final /* synthetic */ SnapshotState<CostBasisErrorDetails> $errorResponse$delegate;
        final /* synthetic */ SnapshotState4<Event<CryptoCostBasisEntryEvent>> $event$delegate;
        final /* synthetic */ Function0<Unit> $exit;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnapshotState<Boolean> $showUnsavedChangeWarning$delegate;
        final /* synthetic */ SnapshotState4<CryptoCostBasisEntryViewState> $state$delegate;

        C128102(CoroutineScope coroutineScope, CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, Modifier modifier, Function0<Unit> function0, SnapshotState4<CryptoCostBasisEntryViewState> snapshotState4, SnapshotState<CostBasisErrorDetails> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState4<Event<CryptoCostBasisEntryEvent>> snapshotState42) {
            this.$scope = coroutineScope;
            this.$duxo = cryptoCostBasisEntryDuxo;
            this.$modifier = modifier;
            this.$exit = function0;
            this.$state$delegate = snapshotState4;
            this.$errorResponse$delegate = snapshotState;
            this.$showUnsavedChangeWarning$delegate = snapshotState2;
            this.$event$delegate = snapshotState42;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, InputRow focusedRow, KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(focusedRow, "focusedRow");
            Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C12811xd32a9f50(cryptoCostBasisEntryDuxo, focusedRow, keyEvent, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, InputRow input) {
            Intrinsics.checkNotNullParameter(input, "input");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C12812xd338b6d1(cryptoCostBasisEntryDuxo, input, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, ImmutableList inputs) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            cryptoCostBasisEntryDuxo.submit((ImmutableList<? extends InputRow>) inputs);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(SnapshotState snapshotState) {
            CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$4(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(Function0 function0, SnapshotState snapshotState) {
            CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$7(snapshotState, false);
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(SnapshotState snapshotState) {
            CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$7(snapshotState, false);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            EventConsumer eventConsumer;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1504786560, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposable.<anonymous> (CryptoCostBasisEntryComposable.kt:108)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            CryptoCostBasisEntryViewState cryptoCostBasisEntryViewStateCryptoCostBasisEntryComposable$lambda$0 = CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$0(this.$state$delegate);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$duxo);
            final CoroutineScope coroutineScope = this.$scope;
            final CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo = this.$duxo;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisEntryComposableKt.C128102.invoke$lambda$1$lambda$0(coroutineScope, cryptoCostBasisEntryDuxo, (InputRow) obj, (KeyEvent) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function2 function2 = (Function2) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$duxo);
            final CoroutineScope coroutineScope2 = this.$scope;
            final CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo2 = this.$duxo;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoCostBasisEntryComposableKt.C128102.invoke$lambda$3$lambda$2(coroutineScope2, cryptoCostBasisEntryDuxo2, (InputRow) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(this.$duxo);
            final CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo3 = this.$duxo;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoCostBasisEntryComposableKt.C128102.invoke$lambda$5$lambda$4(cryptoCostBasisEntryDuxo3, (ImmutableList) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposableContent(cryptoCostBasisEntryViewStateCryptoCostBasisEntryComposable$lambda$0, function2, function1, (Function1) objRememberedValue3, this.$modifier, composer, 0, 0);
            CostBasisErrorDetails costBasisErrorDetailsCryptoCostBasisEntryComposable$lambda$3 = CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$3(this.$errorResponse$delegate);
            composer.startReplaceGroup(-1304072559);
            if (costBasisErrorDetailsCryptoCostBasisEntryComposable$lambda$3 != null) {
                final SnapshotState<CostBasisErrorDetails> snapshotState = this.$errorResponse$delegate;
                composer.startReplaceGroup(5004770);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisEntryComposableKt.C128102.invoke$lambda$8$lambda$7$lambda$6(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                CostBasisErrorDialog.CostBasisErrorDialog(costBasisErrorDetailsCryptoCostBasisEntryComposable$lambda$3, (Function0) objRememberedValue4, null, composer, StringResource.$stable | 48, 4);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            if (CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$6(this.$showUnsavedChangeWarning$delegate)) {
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(this.$exit);
                final Function0<Unit> function0 = this.$exit;
                final SnapshotState<Boolean> snapshotState2 = this.$showUnsavedChangeWarning$delegate;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisEntryComposableKt.C128102.invoke$lambda$10$lambda$9(function0, snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function0 function02 = (Function0) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState3 = this.$showUnsavedChangeWarning$delegate;
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisEntryComposableKt.C128102.invoke$lambda$12$lambda$11(snapshotState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                CryptoCostBasisEntryComposableKt.UnsavedChangeDialog(function02, (Function0) objRememberedValue6, null, composer, 48, 4);
            }
            final Event eventCryptoCostBasisEntryComposable$lambda$1 = CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$1(this.$event$delegate);
            if (eventCryptoCostBasisEntryComposable$lambda$1 != null) {
                final Function0<Unit> function03 = this.$exit;
                final SnapshotState<CostBasisErrorDetails> snapshotState4 = this.$errorResponse$delegate;
                if ((eventCryptoCostBasisEntryComposable$lambda$1.getData() instanceof CryptoCostBasisEntryEvent) && (eventConsumer = (EventConsumer) eventCryptoCostBasisEntryComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventCryptoCostBasisEntryComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposable$2$invoke$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12921invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12921invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoCostBasisEntryEvent cryptoCostBasisEntryEvent = (CryptoCostBasisEntryEvent) eventCryptoCostBasisEntryComposable$lambda$1.getData();
                            if (cryptoCostBasisEntryEvent instanceof CryptoCostBasisEntryEvent.Submitted) {
                                EventLogger.DefaultImpls.logUserInteractionEvent$default(current, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CRYPTO_TRANSFER_ADD_COST_BASIS_LOT_SUCCESS, null, null, null, 59, null)), UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED), false, false, 6, null);
                                function03.invoke();
                            } else {
                                if (cryptoCostBasisEntryEvent instanceof CryptoCostBasisEntryEvent.Error) {
                                    CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable$lambda$4(snapshotState4, ((CryptoCostBasisEntryEvent.Error) cryptoCostBasisEntryEvent).getResponse());
                                    return;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    });
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoCostBasisEntryComposable$lambda$4(SnapshotState<CostBasisErrorDetails> snapshotState, CostBasisErrorDetails costBasisErrorDetails) {
        snapshotState.setValue(costBasisErrorDetails);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoCostBasisEntryComposableContent(final CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, final Function2<? super InputRow, ? super KeyEvent, Unit> function2, final Function1<? super InputRow, Unit> function1, final Function1<? super ImmutableList<? extends InputRow>, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1029492458);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cryptoCostBasisEntryViewState) : composerStartRestartGroup.changedInstance(cryptoCostBasisEntryViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1029492458, i3, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent (CryptoCostBasisEntryComposable.kt:176)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), ComposableSingletons$CryptoCostBasisEntryComposableKt.INSTANCE.m12914getLambda$1718403878$feature_crypto_cost_basis_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(900220645, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposableContent.1

                    /* compiled from: CryptoCostBasisEntryComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Function2<InputRow, KeyEvent, Unit> $consumeKeyEvent;
                        final /* synthetic */ PaddingValues $contentPadding;
                        final /* synthetic */ CryptoCostBasisEntryViewState $state;
                        final /* synthetic */ Function1<ImmutableList<? extends InputRow>, Unit> $submitInput;
                        final /* synthetic */ Function1<InputRow, Unit> $validateInput;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, PaddingValues paddingValues, Function1<? super InputRow, Unit> function1, Function2<? super InputRow, ? super KeyEvent, Unit> function2, Function1<? super ImmutableList<? extends InputRow>, Unit> function12) {
                            this.$state = cryptoCostBasisEntryViewState;
                            this.$contentPadding = paddingValues;
                            this.$validateInput = function1;
                            this.$consumeKeyEvent = function2;
                            this.$submitInput = function12;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final InputRow.Type invoke$lambda$2(SnapshotState<InputRow.Type> snapshotState) {
                            return snapshotState.getValue();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$3(SnapshotState<InputRow.Type> snapshotState, InputRow.Type type2) {
                            snapshotState.setValue(type2);
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
                                ComposerKt.traceEventStart(348322645, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent.<anonymous>.<anonymous> (CryptoCostBasisEntryComposable.kt:192)");
                            }
                            Object objRememberedValue = composer.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new BentoNumpadScopeV22(coroutineScope);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            BentoNumpadScopeV22 bentoNumpadScopeV22 = (BentoNumpadScopeV22) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-269378911);
                            if (!this.$state.getInputRows().isEmpty()) {
                                Unit unit = Unit.INSTANCE;
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$state);
                                CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState = this.$state;
                                Object objRememberedValue4 = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new C12814x9663c052(cryptoCostBasisEntryViewState, snapshotState, null);
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                composer.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 6);
                            }
                            composer.endReplaceGroup();
                            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(bentoNumpadScopeV22, ComposableLambda3.rememberComposableLambda(458525734, true, new AnonymousClass2(this.$state, this.$validateInput, snapshotState), composer, 54), PaddingKt.padding(Modifier.INSTANCE, this.$contentPadding), null, ComposableLambda3.rememberComposableLambda(42169513, true, new AnonymousClass3(this.$state, this.$consumeKeyEvent, current, userInteractionEventDescriptor, this.$submitInput, snapshotState), composer, 54), composer, BentoNumpadScopeV22.$stable | 24624, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoCostBasisEntryComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState<InputRow.Type> $focusedRowType$delegate;
                            final /* synthetic */ CryptoCostBasisEntryViewState $state;
                            final /* synthetic */ Function1<InputRow, Unit> $validateInput;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, Function1<? super InputRow, Unit> function1, SnapshotState<InputRow.Type> snapshotState) {
                                this.$state = cryptoCostBasisEntryViewState;
                                this.$validateInput = function1;
                                this.$focusedRowType$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
                                invoke(bentoNumpadScopeV2, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
                                final SnapshotState<InputRow.Type> snapshotState;
                                Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(458525734, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisEntryComposable.kt:206)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState = this.$state;
                                Function1<InputRow, Unit> function1 = this.$validateInput;
                                SnapshotState<InputRow.Type> snapshotState2 = this.$focusedRowType$delegate;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
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
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                                SnapshotState<InputRow.Type> snapshotState3 = snapshotState2;
                                Function1<InputRow, Unit> function12 = function1;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                                BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(cryptoCostBasisEntryViewState.getSubtitle(), composer, StringResource.$stable), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                                composer.startReplaceGroup(-1129127419);
                                for (final InputRow inputRow : cryptoCostBasisEntryViewState.getInputRows()) {
                                    boolean z = AnonymousClass1.invoke$lambda$2(snapshotState3) == inputRow.getType();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer.changedInstance(inputRow);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        snapshotState = snapshotState3;
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoCostBasisEntryComposableKt.C128131.AnonymousClass1.AnonymousClass2.invoke$lambda$5$lambda$4$lambda$3$lambda$1$lambda$0(inputRow, snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    } else {
                                        snapshotState = snapshotState3;
                                    }
                                    composer.endReplaceGroup();
                                    CryptoCostBasisEntryComposableKt.InputRow(inputRow, z, (Function0) objRememberedValue, null, composer, 0, 8);
                                    composer.startReplaceGroup(-1633490746);
                                    Function1<InputRow, Unit> function13 = function12;
                                    boolean zChanged = composer.changed(function13) | composer.changedInstance(inputRow);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new C12815xe561bb88(function13, inputRow, null);
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(inputRow, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                                    function12 = function13;
                                    snapshotState3 = snapshotState;
                                }
                                composer.endReplaceGroup();
                                composer.endNode();
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_disclosure, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i3).getTextS(), composer, 0, 0, 8120);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$1$lambda$0(InputRow inputRow, SnapshotState snapshotState) {
                                AnonymousClass1.invoke$lambda$3(snapshotState, inputRow.getType());
                                return Unit.INSTANCE;
                            }
                        }

                        /* compiled from: CryptoCostBasisEntryComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$3, reason: invalid class name */
                        static final class AnonymousClass3 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
                            final /* synthetic */ Function2<InputRow, KeyEvent, Unit> $consumeKeyEvent;
                            final /* synthetic */ UserInteractionEventDescriptor $descriptor;
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ SnapshotState<InputRow.Type> $focusedRowType$delegate;
                            final /* synthetic */ CryptoCostBasisEntryViewState $state;
                            final /* synthetic */ Function1<ImmutableList<? extends InputRow>, Unit> $submitInput;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass3(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, Function2<? super InputRow, ? super KeyEvent, Unit> function2, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1<? super ImmutableList<? extends InputRow>, Unit> function1, SnapshotState<InputRow.Type> snapshotState) {
                                this.$state = cryptoCostBasisEntryViewState;
                                this.$consumeKeyEvent = function2;
                                this.$eventLogger = eventLogger;
                                this.$descriptor = userInteractionEventDescriptor;
                                this.$submitInput = function1;
                                this.$focusedRowType$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
                                invoke(bentoNumpadScopeV2, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(42169513, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisEntryComposable.kt:253)");
                                }
                                BentoNumpad4 bentoNumpad4 = BentoNumpad4.INSTANCE;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null);
                                String strStringResource = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_cta, composer, 0);
                                boolean zIsSaveButtonEnabled = this.$state.isSaveButtonEnabled();
                                boolean zIsSaveButtonLoading = this.$state.isSaveButtonLoading();
                                boolean z = AnonymousClass1.invoke$lambda$2(this.$focusedRowType$delegate) != InputRow.Type.PURCHASE_DATE;
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$consumeKeyEvent);
                                final CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState = this.$state;
                                final Function2<InputRow, KeyEvent, Unit> function2 = this.$consumeKeyEvent;
                                final SnapshotState<InputRow.Type> snapshotState = this.$focusedRowType$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$3$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoCostBasisEntryComposableKt.C128131.AnonymousClass1.AnonymousClass3.invoke$lambda$2$lambda$1(cryptoCostBasisEntryViewState, function2, snapshotState, (KeyEvent) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function1<? super KeyEvent, Unit> function1 = (Function1) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$descriptor) | composer.changed(this.$submitInput) | composer.changedInstance(this.$state);
                                final EventLogger eventLogger = this.$eventLogger;
                                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
                                final Function1<ImmutableList<? extends InputRow>, Unit> function12 = this.$submitInput;
                                final CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState2 = this.$state;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$3$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoCostBasisEntryComposableKt.C128131.AnonymousClass1.AnonymousClass3.invoke$lambda$4$lambda$3(eventLogger, userInteractionEventDescriptor, function12, cryptoCostBasisEntryViewState2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                bentoNumpad4.BentoNumpadWithButton(modifierM5146paddingqDBjuR0$default, function1, strStringResource, (Function0) objRememberedValue2, false, zIsSaveButtonEnabled, false, zIsSaveButtonLoading, z, true, null, false, composer, 805306368, (BentoNumpad4.$stable << 6) | 6, 2128);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, Function2 function2, SnapshotState snapshotState, KeyEvent keyEvent) {
                                InputRow next;
                                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                                Iterator<InputRow> it = cryptoCostBasisEntryViewState.getInputRows().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (next.getType() == AnonymousClass1.invoke$lambda$2(snapshotState)) {
                                        break;
                                    }
                                }
                                InputRow inputRow = next;
                                if (inputRow == null) {
                                    return Unit.INSTANCE;
                                }
                                function2.invoke(inputRow, keyEvent);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1 function1, CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState) {
                                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, null, 4, null), null, 47, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                                function1.invoke(cryptoCostBasisEntryViewState.getInputRows());
                                return Unit.INSTANCE;
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i5 & 6) == 0) {
                            i5 |= composer3.changed(contentPadding) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(900220645, i5, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent.<anonymous> (CryptoCostBasisEntryComposable.kt:191)");
                        }
                        LocalShowPlaceholder.Loadable(cryptoCostBasisEntryViewState.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(348322645, true, new AnonymousClass1(cryptoCostBasisEntryViewState, contentPadding, function1, function2, function12), composer3, 54), composer3, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306416, 508);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposableContent$lambda$17(cryptoCostBasisEntryViewState, function2, function1, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null), ComposableSingletons$CryptoCostBasisEntryComposableKt.INSTANCE.m12914getLambda$1718403878$feature_crypto_cost_basis_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(900220645, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposableContent.1

                /* compiled from: CryptoCostBasisEntryComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Function2<InputRow, KeyEvent, Unit> $consumeKeyEvent;
                    final /* synthetic */ PaddingValues $contentPadding;
                    final /* synthetic */ CryptoCostBasisEntryViewState $state;
                    final /* synthetic */ Function1<ImmutableList<? extends InputRow>, Unit> $submitInput;
                    final /* synthetic */ Function1<InputRow, Unit> $validateInput;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, PaddingValues paddingValues, Function1<? super InputRow, Unit> function1, Function2<? super InputRow, ? super KeyEvent, Unit> function2, Function1<? super ImmutableList<? extends InputRow>, Unit> function12) {
                        this.$state = cryptoCostBasisEntryViewState;
                        this.$contentPadding = paddingValues;
                        this.$validateInput = function1;
                        this.$consumeKeyEvent = function2;
                        this.$submitInput = function12;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final InputRow.Type invoke$lambda$2(SnapshotState<InputRow.Type> snapshotState) {
                        return snapshotState.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void invoke$lambda$3(SnapshotState<InputRow.Type> snapshotState, InputRow.Type type2) {
                        snapshotState.setValue(type2);
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
                            ComposerKt.traceEventStart(348322645, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent.<anonymous>.<anonymous> (CryptoCostBasisEntryComposable.kt:192)");
                        }
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new BentoNumpadScopeV22(coroutineScope);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        BentoNumpadScopeV22 bentoNumpadScopeV22 = (BentoNumpadScopeV22) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-269378911);
                        if (!this.$state.getInputRows().isEmpty()) {
                            Unit unit = Unit.INSTANCE;
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$state);
                            CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState = this.$state;
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new C12814x9663c052(cryptoCostBasisEntryViewState, snapshotState, null);
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 6);
                        }
                        composer.endReplaceGroup();
                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(bentoNumpadScopeV22, ComposableLambda3.rememberComposableLambda(458525734, true, new AnonymousClass2(this.$state, this.$validateInput, snapshotState), composer, 54), PaddingKt.padding(Modifier.INSTANCE, this.$contentPadding), null, ComposableLambda3.rememberComposableLambda(42169513, true, new AnonymousClass3(this.$state, this.$consumeKeyEvent, current, userInteractionEventDescriptor, this.$submitInput, snapshotState), composer, 54), composer, BentoNumpadScopeV22.$stable | 24624, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoCostBasisEntryComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<InputRow.Type> $focusedRowType$delegate;
                        final /* synthetic */ CryptoCostBasisEntryViewState $state;
                        final /* synthetic */ Function1<InputRow, Unit> $validateInput;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, Function1<? super InputRow, Unit> function1, SnapshotState<InputRow.Type> snapshotState) {
                            this.$state = cryptoCostBasisEntryViewState;
                            this.$validateInput = function1;
                            this.$focusedRowType$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
                            invoke(bentoNumpadScopeV2, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
                            final SnapshotState snapshotState;
                            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(458525734, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisEntryComposable.kt:206)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState = this.$state;
                            Function1<InputRow, Unit> function1 = this.$validateInput;
                            SnapshotState<InputRow.Type> snapshotState2 = this.$focusedRowType$delegate;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
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
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                            SnapshotState<InputRow.Type> snapshotState3 = snapshotState2;
                            Function1<InputRow, Unit> function12 = function1;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                            BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(cryptoCostBasisEntryViewState.getSubtitle(), composer, StringResource.$stable), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                            composer.startReplaceGroup(-1129127419);
                            for (final InputRow inputRow : cryptoCostBasisEntryViewState.getInputRows()) {
                                boolean z = AnonymousClass1.invoke$lambda$2(snapshotState3) == inputRow.getType();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(inputRow);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    snapshotState = snapshotState3;
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoCostBasisEntryComposableKt.C128131.AnonymousClass1.AnonymousClass2.invoke$lambda$5$lambda$4$lambda$3$lambda$1$lambda$0(inputRow, snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                } else {
                                    snapshotState = snapshotState3;
                                }
                                composer.endReplaceGroup();
                                CryptoCostBasisEntryComposableKt.InputRow(inputRow, z, (Function0) objRememberedValue, null, composer, 0, 8);
                                composer.startReplaceGroup(-1633490746);
                                Function1<InputRow, Unit> function13 = function12;
                                boolean zChanged = composer.changed(function13) | composer.changedInstance(inputRow);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new C12815xe561bb88(function13, inputRow, null);
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                EffectsKt.LaunchedEffect(inputRow, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                                function12 = function13;
                                snapshotState3 = snapshotState;
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_disclosure, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i3).getTextS(), composer, 0, 0, 8120);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$1$lambda$0(InputRow inputRow, SnapshotState snapshotState) {
                            AnonymousClass1.invoke$lambda$3(snapshotState, inputRow.getType());
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: CryptoCostBasisEntryComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
                        final /* synthetic */ Function2<InputRow, KeyEvent, Unit> $consumeKeyEvent;
                        final /* synthetic */ UserInteractionEventDescriptor $descriptor;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ SnapshotState<InputRow.Type> $focusedRowType$delegate;
                        final /* synthetic */ CryptoCostBasisEntryViewState $state;
                        final /* synthetic */ Function1<ImmutableList<? extends InputRow>, Unit> $submitInput;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass3(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, Function2<? super InputRow, ? super KeyEvent, Unit> function2, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1<? super ImmutableList<? extends InputRow>, Unit> function1, SnapshotState<InputRow.Type> snapshotState) {
                            this.$state = cryptoCostBasisEntryViewState;
                            this.$consumeKeyEvent = function2;
                            this.$eventLogger = eventLogger;
                            this.$descriptor = userInteractionEventDescriptor;
                            this.$submitInput = function1;
                            this.$focusedRowType$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
                            invoke(bentoNumpadScopeV2, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(42169513, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent.<anonymous>.<anonymous>.<anonymous> (CryptoCostBasisEntryComposable.kt:253)");
                            }
                            BentoNumpad4 bentoNumpad4 = BentoNumpad4.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null);
                            String strStringResource = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_cta, composer, 0);
                            boolean zIsSaveButtonEnabled = this.$state.isSaveButtonEnabled();
                            boolean zIsSaveButtonLoading = this.$state.isSaveButtonLoading();
                            boolean z = AnonymousClass1.invoke$lambda$2(this.$focusedRowType$delegate) != InputRow.Type.PURCHASE_DATE;
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$consumeKeyEvent);
                            final CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState = this.$state;
                            final Function2 function2 = this.$consumeKeyEvent;
                            final SnapshotState snapshotState = this.$focusedRowType$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoCostBasisEntryComposableKt.C128131.AnonymousClass1.AnonymousClass3.invoke$lambda$2$lambda$1(cryptoCostBasisEntryViewState, function2, snapshotState, (KeyEvent) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1<? super KeyEvent, Unit> function1 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$descriptor) | composer.changed(this.$submitInput) | composer.changedInstance(this.$state);
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
                            final Function1 function12 = this.$submitInput;
                            final CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState2 = this.$state;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$3$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoCostBasisEntryComposableKt.C128131.AnonymousClass1.AnonymousClass3.invoke$lambda$4$lambda$3(eventLogger, userInteractionEventDescriptor, function12, cryptoCostBasisEntryViewState2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            bentoNumpad4.BentoNumpadWithButton(modifierM5146paddingqDBjuR0$default, function1, strStringResource, (Function0) objRememberedValue2, false, zIsSaveButtonEnabled, false, zIsSaveButtonLoading, z, true, null, false, composer, 805306368, (BentoNumpad4.$stable << 6) | 6, 2128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, Function2 function2, SnapshotState snapshotState, KeyEvent keyEvent) {
                            InputRow next;
                            Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                            Iterator<InputRow> it = cryptoCostBasisEntryViewState.getInputRows().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                if (next.getType() == AnonymousClass1.invoke$lambda$2(snapshotState)) {
                                    break;
                                }
                            }
                            InputRow inputRow = next;
                            if (inputRow == null) {
                                return Unit.INSTANCE;
                            }
                            function2.invoke(inputRow, keyEvent);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1 function1, CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState) {
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, null, 4, null), null, 47, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                            function1.invoke(cryptoCostBasisEntryViewState.getInputRows());
                            return Unit.INSTANCE;
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues contentPadding, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i5 & 6) == 0) {
                        i5 |= composer3.changed(contentPadding) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(900220645, i5, -1, "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableContent.<anonymous> (CryptoCostBasisEntryComposable.kt:191)");
                    }
                    LocalShowPlaceholder.Loadable(cryptoCostBasisEntryViewState.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(348322645, true, new AnonymousClass1(cryptoCostBasisEntryViewState, contentPadding, function1, function2, function12), composer3, 54), composer3, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputRow(final InputRow inputRow, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        String inlineError;
        long jM21452getNegative0d7_KjU;
        Object objRememberedValue;
        Composer.Companion companion;
        EventLogger current;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        Context context;
        boolean zChanged;
        Object objRememberedValue2;
        String str;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-147864430);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(inputRow) : composerStartRestartGroup.changedInstance(inputRow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-147864430, i3, -1, "com.robinhood.android.crypto.costbasis.details.entry.InputRow (CryptoCostBasisEntryComposable.kt:293)");
                    }
                    inlineError = inputRow.getInlineError();
                    StringResource stringResourceInvoke = inlineError == null ? StringResource.INSTANCE.invoke(inlineError) : inputRow.getLabelDescription();
                    if (inputRow.getInlineError() != null) {
                        composerStartRestartGroup.startReplaceGroup(1607611778);
                        jM21452getNegative0d7_KjU = CryptoOrderInputRow8.INSTANCE.getStyle(composerStartRestartGroup, CryptoOrderInputRow8.$stable).m25290getStartSecondaryTextColor0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1607693990);
                        jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    CryptoOrderInputRowState.TextContent textContent = new CryptoOrderInputRowState.TextContent(inputRow.getLabel(), null, null, false, 14, null);
                    CryptoOrderInputRowState.TextContent textContent2 = stringResourceInvoke == null ? new CryptoOrderInputRowState.TextContent(stringResourceInvoke, null, null, false, 14, null) : null;
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    CryptoOrderInputRowState cryptoOrderInputRowState = new CryptoOrderInputRowState(textContent, textContent2, companion2.invoke(inputRow.getPlaceholder()), companion2.invoke(inputRow.getValue()), null, false, z2, 48, null);
                    CryptoOrderInputRowStyle cryptoOrderInputRowStyleM25280copyhLbrIc0$default = CryptoOrderInputRowStyle.m25280copyhLbrIc0$default(CryptoOrderInputRow8.INSTANCE.getStyle(composerStartRestartGroup, CryptoOrderInputRow8.$stable), 0L, jM21452getNegative0d7_KjU, 0L, 0L, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 13, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoCostBasisEntryComposableKt.InputRow$lambda$20$lambda$19((CryptoOrderInputRowState.TapAction) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoOrderInputRow.CryptoOrderInputRow(cryptoOrderInputRowState, (Function1) objRememberedValue, function02, modifier4, cryptoOrderInputRowStyleM25280copyhLbrIc0$default, null, composerStartRestartGroup, CryptoOrderInputRowState.$stable | 48 | (i3 & 896) | (i3 & 7168) | (CryptoOrderInputRowStyle.$stable << 12), 32);
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    context = userInteractionEventDescriptor.getContext();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(inputRow))) | composerStartRestartGroup.changed(inlineError) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        str = inlineError;
                        CryptoCostBasisEntryComposableKt$InputRow$3$1 cryptoCostBasisEntryComposableKt$InputRow$3$1 = new CryptoCostBasisEntryComposableKt$InputRow$3$1(str, current, userInteractionEventDescriptor, inputRow, context, null);
                        composerStartRestartGroup.updateRememberedValue(cryptoCostBasisEntryComposableKt$InputRow$3$1);
                        objRememberedValue2 = cryptoCostBasisEntryComposableKt$InputRow$3$1;
                    } else {
                        str = inlineError;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoCostBasisEntryComposableKt.InputRow$lambda$22(inputRow, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                inlineError = inputRow.getInlineError();
                StringResource stringResourceInvoke2 = inlineError == null ? StringResource.INSTANCE.invoke(inlineError) : inputRow.getLabelDescription();
                if (inputRow.getInlineError() != null) {
                }
                CryptoOrderInputRowState.TextContent textContent3 = new CryptoOrderInputRowState.TextContent(inputRow.getLabel(), null, null, false, 14, null);
                CryptoOrderInputRowState.TextContent textContent22 = stringResourceInvoke2 == null ? new CryptoOrderInputRowState.TextContent(stringResourceInvoke2, null, null, false, 14, null) : null;
                StringResource.Companion companion22 = StringResource.INSTANCE;
                CryptoOrderInputRowState cryptoOrderInputRowState2 = new CryptoOrderInputRowState(textContent3, textContent22, companion22.invoke(inputRow.getPlaceholder()), companion22.invoke(inputRow.getValue()), null, false, z2, 48, null);
                CryptoOrderInputRowStyle cryptoOrderInputRowStyleM25280copyhLbrIc0$default2 = CryptoOrderInputRowStyle.m25280copyhLbrIc0$default(CryptoOrderInputRow8.INSTANCE.getStyle(composerStartRestartGroup, CryptoOrderInputRow8.$stable), 0L, jM21452getNegative0d7_KjU, 0L, 0L, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 13, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                CryptoOrderInputRow.CryptoOrderInputRow(cryptoOrderInputRowState2, (Function1) objRememberedValue, function02, modifier4, cryptoOrderInputRowStyleM25280copyhLbrIc0$default2, null, composerStartRestartGroup, CryptoOrderInputRowState.$stable | 48 | (i3 & 896) | (i3 & 7168) | (CryptoOrderInputRowStyle.$stable << 12), 32);
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                context = userInteractionEventDescriptor.getContext();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                if ((i3 & 14) != 4) {
                    zChanged = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(inputRow))) | composerStartRestartGroup.changed(inlineError) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        str = inlineError;
                        CryptoCostBasisEntryComposableKt$InputRow$3$1 cryptoCostBasisEntryComposableKt$InputRow$3$12 = new CryptoCostBasisEntryComposableKt$InputRow$3$1(str, current, userInteractionEventDescriptor, inputRow, context, null);
                        composerStartRestartGroup.updateRememberedValue(cryptoCostBasisEntryComposableKt$InputRow$3$12);
                        objRememberedValue2 = cryptoCostBasisEntryComposableKt$InputRow$3$12;
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputRow$lambda$20$lambda$19(CryptoOrderInputRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnsavedChangeDialog(final Function0<Unit> exit, final Function0<Unit> dismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptorUpdateComponent;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-690660028);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(exit) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismiss) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-690660028, i3, -1, "com.robinhood.android.crypto.costbasis.details.entry.UnsavedChangeDialog (CryptoCostBasisEntryComposable.kt:355)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptorUpdateComponent = CostBasisLoggingUtils.updateComponent((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), Component.ComponentType.ALERT, "unsaved_changes");
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateComponent);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisEntryComposableKt.UnsavedChangeDialog$lambda$24$lambda$23(current, userInteractionEventDescriptorUpdateComponent, dismiss);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, userInteractionEventDescriptorUpdateComponent, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Modifier modifier5 = modifier4;
                String strStringResource = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_unsaved_change_title, composerStartRestartGroup, 0);
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_unsaved_change_body, composerStartRestartGroup, 0));
                String strStringResource2 = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_unsaved_change_primary_cta, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateComponent) | ((i3 & 14) == 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisEntryComposableKt.UnsavedChangeDialog$lambda$26$lambda$25(current, userInteractionEventDescriptorUpdateComponent, exit);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue2);
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_unsaved_change_secondary_cta, composerStartRestartGroup, 0), function0);
                int i5 = BentoAlertDialog2.Body.Text.$stable << 3;
                int i6 = BentoAlertButton.$stable;
                BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, modifierAutoLogEvents$default, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i5 | (i6 << 6) | (i6 << 12), 224);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoCostBasisEntryComposableKt.UnsavedChangeDialog$lambda$27(exit, dismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptorUpdateComponent = CostBasisLoggingUtils.updateComponent((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), Component.ComponentType.ALERT, "unsaved_changes");
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateComponent);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoCostBasisEntryComposableKt.UnsavedChangeDialog$lambda$24$lambda$23(current, userInteractionEventDescriptorUpdateComponent, dismiss);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function0 function02 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, userInteractionEventDescriptorUpdateComponent, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Modifier modifier52 = modifier4;
                String strStringResource3 = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_unsaved_change_title, composerStartRestartGroup, 0);
                BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_unsaved_change_body, composerStartRestartGroup, 0));
                String strStringResource22 = StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_unsaved_change_primary_cta, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorUpdateComponent) | ((i3 & 14) == 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoCostBasisEntryComposableKt.UnsavedChangeDialog$lambda$26$lambda$25(current, userInteractionEventDescriptorUpdateComponent, exit);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton3 = new BentoAlertButton(strStringResource22, (Function0) objRememberedValue2);
                    BentoAlertButton bentoAlertButton22 = new BentoAlertButton(StringResources_androidKt.stringResource(C12782R.string.cost_basis_details_entry_unsaved_change_secondary_cta, composerStartRestartGroup, 0), function02);
                    int i52 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i62 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(strStringResource3, text2, bentoAlertButton3, modifierAutoLogEvents$default2, bentoAlertButton22, null, false, null, function02, composerStartRestartGroup, i52 | (i62 << 6) | (i62 << 12), 224);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnsavedChangeDialog$lambda$24$lambda$23(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(CostBasisLoggingUtils.updateComponent(userInteractionEventDescriptor, Component.ComponentType.BUTTON, "go_back"), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnsavedChangeDialog$lambda$26$lambda$25(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(CostBasisLoggingUtils.updateComponent(userInteractionEventDescriptor, Component.ComponentType.BUTTON, AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_CONFIRM), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    @DayNightPreview
    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-995169979);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-995169979, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.Preview (CryptoCostBasisEntryComposable.kt:404)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, Boolean.TRUE, null, null, ComposableSingletons$CryptoCostBasisEntryComposableKt.INSTANCE.m12915getLambda$200545027$feature_crypto_cost_basis_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoCostBasisEntryComposableKt.Preview$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
