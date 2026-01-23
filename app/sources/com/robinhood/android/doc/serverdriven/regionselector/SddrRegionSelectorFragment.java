package com.robinhood.android.doc.serverdriven.regionselector;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment;
import com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorViewState;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SddrRegionSelectorFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-doc-upload_externalRelease", "viewState", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrRegionSelectorFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SddrRegionSelectorDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SddrRegionSelectorFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SddrRegionSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Callbacks;", "", "onRegionSelected", "", "region", "Lcom/robinhood/iso/countrycode/CountryCode;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRegionSelected(CountryCode region);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(SddrRegionSelectorFragment sddrRegionSelectorFragment, int i, Composer composer, int i2) {
        sddrRegionSelectorFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SddrRegionSelectorDuxo getDuxo() {
        return (SddrRegionSelectorDuxo) this.duxo.getValue();
    }

    /* compiled from: SddrRegionSelectorFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment$ComposeContent$1 */
    static final class C143201 implements Function2<Composer, Integer, Unit> {
        C143201() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SddrRegionSelectorFragment sddrRegionSelectorFragment, String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            sddrRegionSelectorFragment.getDuxo().filter(query);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(SddrRegionSelectorFragment sddrRegionSelectorFragment, CountryCode option) {
            Intrinsics.checkNotNullParameter(option, "option");
            sddrRegionSelectorFragment.getDuxo().select(option);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(SddrRegionSelectorViewState sddrRegionSelectorViewState, SddrRegionSelectorFragment sddrRegionSelectorFragment) {
            CountryCode selected = ((SddrRegionSelectorViewState.Loaded) sddrRegionSelectorViewState).getSelected();
            if (selected != null) {
                sddrRegionSelectorFragment.getCallbacks().onRegionSelected(selected);
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(92116252, i, -1, "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment.ComposeContent.<anonymous> (SddrRegionSelectorFragment.kt:31)");
            }
            final SddrRegionSelectorViewState sddrRegionSelectorViewStateInvoke$lambda$0 = invoke$lambda$0(FlowExtKt.collectAsStateWithLifecycle(SddrRegionSelectorFragment.this.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7));
            if (Intrinsics.areEqual(sddrRegionSelectorViewStateInvoke$lambda$0, SddrRegionSelectorViewState.Loading.INSTANCE)) {
                composer.startReplaceGroup(-248662978);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composer, 0, 3);
                composer.endReplaceGroup();
            } else if (sddrRegionSelectorViewStateInvoke$lambda$0 instanceof SddrRegionSelectorViewState.Loaded) {
                composer.startReplaceGroup(-248514736);
                SddrRegionSelectorViewState.Loaded loaded = (SddrRegionSelectorViewState.Loaded) sddrRegionSelectorViewStateInvoke$lambda$0;
                CountryCode selected = loaded.getSelected();
                ImmutableList immutableList = extensions2.toImmutableList(loaded.getVisibleOptions());
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(SddrRegionSelectorFragment.this);
                final SddrRegionSelectorFragment sddrRegionSelectorFragment = SddrRegionSelectorFragment.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SddrRegionSelectorFragment.C143201.invoke$lambda$2$lambda$1(sddrRegionSelectorFragment, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(SddrRegionSelectorFragment.this);
                final SddrRegionSelectorFragment sddrRegionSelectorFragment2 = SddrRegionSelectorFragment.this;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SddrRegionSelectorFragment.C143201.invoke$lambda$4$lambda$3(sddrRegionSelectorFragment2, (CountryCode) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer.changedInstance(sddrRegionSelectorViewStateInvoke$lambda$0) | composer.changedInstance(SddrRegionSelectorFragment.this);
                final SddrRegionSelectorFragment sddrRegionSelectorFragment3 = SddrRegionSelectorFragment.this;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment$ComposeContent$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SddrRegionSelectorFragment.C143201.invoke$lambda$7$lambda$6(sddrRegionSelectorViewStateInvoke$lambda$0, sddrRegionSelectorFragment3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                SddrRegionSelectorComposable.SddrRegionSelectorComposable(selected, immutableList, function1, function12, (Function0) objRememberedValue3, null, composer, 0, 32);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-247833914);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        private static final SddrRegionSelectorViewState invoke$lambda$0(SnapshotState4<? extends SddrRegionSelectorViewState> snapshotState4) {
            return snapshotState4.getValue();
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1362589945);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1362589945, i2, -1, "com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment.ComposeContent (SddrRegionSelectorFragment.kt:29)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(92116252, true, new C143201(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.serverdriven.regionselector.SddrRegionSelectorFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SddrRegionSelectorFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SddrRegionSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Args;", "Landroid/os/Parcelable;", "selected", "Lcom/robinhood/iso/countrycode/CountryCode;", "options", "", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;Ljava/util/List;)V", "getSelected", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getOptions", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<CountryCode> options;
        private final CountryCode selected;

        /* compiled from: SddrRegionSelectorFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                CountryCode countryCode = (CountryCode) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new Args(countryCode, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, CountryCode countryCode, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode = args.selected;
            }
            if ((i & 2) != 0) {
                list = args.options;
            }
            return args.copy(countryCode, list);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode getSelected() {
            return this.selected;
        }

        public final List<CountryCode> component2() {
            return this.options;
        }

        public final Args copy(CountryCode selected, List<? extends CountryCode> options) {
            Intrinsics.checkNotNullParameter(options, "options");
            return new Args(selected, options);
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
            return Intrinsics.areEqual(this.selected, args.selected) && Intrinsics.areEqual(this.options, args.options);
        }

        public int hashCode() {
            CountryCode countryCode = this.selected;
            return ((countryCode == null ? 0 : countryCode.hashCode()) * 31) + this.options.hashCode();
        }

        public String toString() {
            return "Args(selected=" + this.selected + ", options=" + this.options + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.selected);
            List<CountryCode> list = this.options;
            dest.writeInt(list.size());
            Iterator<CountryCode> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(CountryCode countryCode, List<? extends CountryCode> options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.selected = countryCode;
            this.options = options;
        }

        public final CountryCode getSelected() {
            return this.selected;
        }

        public final List<CountryCode> getOptions() {
            return this.options;
        }
    }

    /* compiled from: SddrRegionSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SddrRegionSelectorFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SddrRegionSelectorFragment sddrRegionSelectorFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sddrRegionSelectorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SddrRegionSelectorFragment newInstance(Args args) {
            return (SddrRegionSelectorFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SddrRegionSelectorFragment sddrRegionSelectorFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sddrRegionSelectorFragment, args);
        }
    }
}
