package com.robinhood.android.regiongate.compose;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle3;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.regiongate.compose.p236di.UserStoreEntryPoint;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: LocalityProvider.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a;\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018²\u0006\u000e\u0010\u0017\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lkotlin/Function0;", "", "content", "LocalityProvider", "(Lcom/robinhood/shared/store/user/UserStore;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/sheriff/User;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/flow/SharingStarted;", "started", "initialValue", "Lkotlinx/coroutines/flow/StateFlow;", "asNullableStateFlow", "(Lio/reactivex/Observable;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Lcom/robinhood/models/db/sheriff/User;)Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/iso/countrycode/CountryCode;", "LocalLocality", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLocality", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "user", "lib-region-gate-compose_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.regiongate.compose.LocalityProviderKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class LocalityProvider {
    private static final CompositionLocal6<CountryCode> LocalLocality = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.regiongate.compose.LocalityProviderKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalityProvider.LocalLocality$lambda$2();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final CountryCode LocalLocality$lambda$2() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LocalityProvider$lambda$1(UserStore userStore, Function2 function2, int i, int i2, Composer composer, int i3) {
        LocalityProvider(userStore, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final StateFlow<User> asNullableStateFlow(Observable<User> observable, CoroutineScope coroutineScope, SharingStarted sharingStarted, User user) {
        return FlowKt.stateIn(Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null), coroutineScope, sharingStarted, user);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalityProvider(final UserStore userStore, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        CountryCode.Supported locality;
        User userLocalityProvider$lambda$0;
        User.Origin origin;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(354380280);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changedInstance(userStore)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                locality = null;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(asNullableStateFlow(userStore.getUser(), Lifecycle3.getCoroutineScope(((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle()), SharingStarted.INSTANCE.getLazily(), null), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                CompositionLocal6<CountryCode> compositionLocal6 = LocalLocality;
                userLocalityProvider$lambda$0 = LocalityProvider$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (userLocalityProvider$lambda$0 != null) {
                    locality = origin.getLocality();
                }
                CompositionLocal3.CompositionLocalProvider(compositionLocal6.provides(locality), ComposableLambda3.rememberComposableLambda(-1823998280, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.regiongate.compose.LocalityProviderKt.LocalityProvider.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1823998280, i4, -1, "com.robinhood.android.regiongate.compose.LocalityProvider.<anonymous> (LocalityProvider.kt:43)");
                        }
                        content.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if ((i2 & 1) != 0) {
                    userStore = ((UserStoreEntryPoint) EntryPoints.applicationEntryPoint((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).userStore();
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354380280, i3, -1, "com.robinhood.android.regiongate.compose.LocalityProvider (LocalityProvider.kt:30)");
                }
                locality = null;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(asNullableStateFlow(userStore.getUser(), Lifecycle3.getCoroutineScope(((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle()), SharingStarted.INSTANCE.getLazily(), null), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                CompositionLocal6<CountryCode> compositionLocal62 = LocalLocality;
                userLocalityProvider$lambda$0 = LocalityProvider$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (userLocalityProvider$lambda$0 != null && (origin = userLocalityProvider$lambda$0.getOrigin()) != null) {
                    locality = origin.getLocality();
                }
                CompositionLocal3.CompositionLocalProvider(compositionLocal62.provides(locality), ComposableLambda3.rememberComposableLambda(-1823998280, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.regiongate.compose.LocalityProviderKt.LocalityProvider.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1823998280, i4, -1, "com.robinhood.android.regiongate.compose.LocalityProvider.<anonymous> (LocalityProvider.kt:43)");
                        }
                        content.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.regiongate.compose.LocalityProviderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LocalityProvider.LocalityProvider$lambda$1(userStore, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final CompositionLocal6<CountryCode> getLocalLocality() {
        return LocalLocality;
    }

    private static final User LocalityProvider$lambda$0(SnapshotState4<User> snapshotState4) {
        return snapshotState4.getValue();
    }
}
