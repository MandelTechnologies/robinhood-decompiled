package com.robinhood.android.gold.rejoin;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.gold.lib.rejoin.api.ApiGoldRejoinFlow;
import com.robinhood.android.gold.rejoin.GoldRejoinLoadingEvent;
import com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: GoldRejoinLoadingFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a²\u0006\u0012\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-gold-rejoin_externalRelease", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldRejoinLoadingFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldRejoinLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, GoldRejoinLoadingDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldRejoinLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: GoldRejoinLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Callbacks;", "", "onRejoinFlowLoaded", "", "goldRejoinFlow", "Lcom/robinhood/android/gold/lib/rejoin/api/ApiGoldRejoinFlow;", "onRejoinFlowFailed", "error", "", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRejoinFlowFailed(Throwable error);

        void onRejoinFlowLoaded(ApiGoldRejoinFlow goldRejoinFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(GoldRejoinLoadingFragment goldRejoinLoadingFragment, int i, Composer composer, int i2) {
        goldRejoinLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final GoldRejoinLoadingDuxo getDuxo() {
        return (GoldRejoinLoadingDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<GoldRejoinLoadingEvent> eventConsumerInvoke;
        EventConsumer<GoldRejoinLoadingEvent> eventConsumerInvoke2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2120488470);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2120488470, i2, -1, "com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment.ComposeContent (GoldRejoinLoadingFragment.kt:36)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<GoldRejoinLoadingEvent> eventComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$0 != null && (eventComposeContent$lambda$0.getData() instanceof GoldRejoinLoadingEvent.Failed) && (eventConsumerInvoke2 = eventComposeContent$lambda$0.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventComposeContent$lambda$0, new Function1() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15064invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15064invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().onRejoinFlowFailed(((GoldRejoinLoadingEvent.Failed) eventComposeContent$lambda$0.getData()).getError());
                    }
                });
            }
            final Event<GoldRejoinLoadingEvent> eventComposeContent$lambda$02 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$02 != null && (eventComposeContent$lambda$02.getData() instanceof GoldRejoinLoadingEvent.Loaded) && (eventConsumerInvoke = eventComposeContent$lambda$02.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$02, new Function1() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment$ComposeContent$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15065invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15065invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().onRejoinFlowLoaded(((GoldRejoinLoadingEvent.Loaded) eventComposeContent$lambda$02.getData()).getGoldRejoinFlow());
                    }
                });
            }
            final AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-235267886, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment.ComposeContent.3
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
                        ComposerKt.traceEventStart(-235267886, i3, -1, "com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment.ComposeContent.<anonymous> (GoldRejoinLoadingFragment.kt:51)");
                    }
                    Function2<Composer, Integer, Unit> lambda$548810181$feature_gold_rejoin_externalRelease = GoldRejoinLoadingFragment2.INSTANCE.getLambda$548810181$feature_gold_rejoin_externalRelease();
                    final AppCompatActivity appCompatActivity = appCompatActivityRequireActivityBaseContext;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$548810181$feature_gold_rejoin_externalRelease, null, ComposableLambda3.rememberComposableLambda(898137585, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment.ComposeContent.3.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i4 & 6) == 0) {
                                i4 |= (i4 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(898137585, i4, -1, "com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment.ComposeContent.<anonymous>.<anonymous> (GoldRejoinLoadingFragment.kt:54)");
                            }
                            AppCompatActivity appCompatActivity2 = appCompatActivity;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(appCompatActivity2);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new GoldRejoinLoadingFragment5(appCompatActivity2);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue), composer3, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, GoldRejoinLoadingFragment2.INSTANCE.getLambda$2122495143$feature_gold_rejoin_externalRelease(), composerStartRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldRejoinLoadingFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldRejoinLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Args;", "Landroid/os/Parcelable;", "source", "", "feature", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getFeature", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String feature;
        private final String source;

        /* compiled from: GoldRejoinLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                str2 = args.feature;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        public final Args copy(String source, String feature) {
            return new Args(source, feature);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.feature, args.feature);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.feature;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(source=" + this.source + ", feature=" + this.feature + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.feature);
        }

        public Args(String str, String str2) {
            this.source = str;
            this.feature = str2;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getFeature() {
            return this.feature;
        }
    }

    /* compiled from: GoldRejoinLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinLoadingFragment$Args;", "<init>", "()V", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldRejoinLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldRejoinLoadingFragment goldRejoinLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldRejoinLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldRejoinLoadingFragment newInstance(Args args) {
            return (GoldRejoinLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldRejoinLoadingFragment goldRejoinLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldRejoinLoadingFragment, args);
        }
    }

    private static final Event<GoldRejoinLoadingEvent> ComposeContent$lambda$0(SnapshotState4<Event<GoldRejoinLoadingEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
