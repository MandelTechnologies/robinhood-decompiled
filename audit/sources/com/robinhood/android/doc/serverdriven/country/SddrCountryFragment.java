package com.robinhood.android.doc.serverdriven.country;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.doc.serverdriven.country.SddrCountryViewState;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: SddrCountryFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-doc-upload_externalRelease", "viewState", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrCountryFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.serverdriven.country.SddrCountryFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SddrCountryDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SddrCountryFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SddrCountryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Callbacks;", "", "onCountrySelected", "", PlaceTypes.COUNTRY, "Lcom/robinhood/iso/countrycode/CountryCode;", "onRegionSelectorRequested", "selected", "options", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCountrySelected(CountryCode country);

        void onRegionSelectorRequested(CountryCode selected, List<? extends CountryCode> options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(SddrCountryFragment sddrCountryFragment, int i, Composer composer, int i2) {
        sddrCountryFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final SddrCountryDuxo getDuxo() {
        return (SddrCountryDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-631846114);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-631846114, i2, -1, "com.robinhood.android.doc.serverdriven.country.SddrCountryFragment.ComposeContent (SddrCountryFragment.kt:31)");
            }
            final SddrCountryViewState sddrCountryViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (Intrinsics.areEqual(sddrCountryViewStateComposeContent$lambda$0, SddrCountryViewState.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(1514278564);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else if (sddrCountryViewStateComposeContent$lambda$0 instanceof SddrCountryViewState.OldPicker) {
                composerStartRestartGroup.startReplaceGroup(1514401293);
                SddrCountryViewState.OldPicker oldPicker = (SddrCountryViewState.OldPicker) sddrCountryViewStateComposeContent$lambda$0;
                String title = oldPicker.getTitle();
                String description = oldPicker.getDescription();
                ImmutableList immutableList = extensions2.toImmutableList(oldPicker.getOptions());
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.doc.serverdriven.country.SddrCountryFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SddrCountryFragment.ComposeContent$lambda$2$lambda$1(this.f$0, (CountryCode) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SddrCountryOldPickerComposable.SddrCountryOldPickerComposable(title, description, immutableList, (Function1) objRememberedValue, null, composerStartRestartGroup, 0, 16);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(sddrCountryViewStateComposeContent$lambda$0 instanceof SddrCountryViewState.NewPicker)) {
                    composerStartRestartGroup.startReplaceGroup(-1613721539);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1514829589);
                SddrCountryViewState.NewPicker newPicker = (SddrCountryViewState.NewPicker) sddrCountryViewStateComposeContent$lambda$0;
                String title2 = newPicker.getTitle();
                String description2 = newPicker.getDescription();
                CountryCode selected = newPicker.getSelected();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(sddrCountryViewStateComposeContent$lambda$0);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.doc.serverdriven.country.SddrCountryFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SddrCountryFragment.ComposeContent$lambda$4$lambda$3(this.f$0, sddrCountryViewStateComposeContent$lambda$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(sddrCountryViewStateComposeContent$lambda$0) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.doc.serverdriven.country.SddrCountryFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SddrCountryFragment.ComposeContent$lambda$7$lambda$6(sddrCountryViewStateComposeContent$lambda$0, this);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                SddrCountryNewPickerComposable.SddrCountryNewPickerComposable(title2, description2, selected, function0, (Function0) objRememberedValue3, null, composerStartRestartGroup, 0, 32);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.serverdriven.country.SddrCountryFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SddrCountryFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(SddrCountryFragment sddrCountryFragment, CountryCode country) {
        Intrinsics.checkNotNullParameter(country, "country");
        sddrCountryFragment.getCallbacks().onCountrySelected(country);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(SddrCountryFragment sddrCountryFragment, SddrCountryViewState sddrCountryViewState) {
        SddrCountryViewState.NewPicker newPicker = (SddrCountryViewState.NewPicker) sddrCountryViewState;
        sddrCountryFragment.getCallbacks().onRegionSelectorRequested(newPicker.getSelected(), newPicker.getOptions());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(SddrCountryViewState sddrCountryViewState, SddrCountryFragment sddrCountryFragment) {
        CountryCode selected = ((SddrCountryViewState.NewPicker) sddrCountryViewState).getSelected();
        if (selected != null) {
            sddrCountryFragment.getCallbacks().onCountrySelected(selected);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SddrCountryFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Args;", "Landroid/os/Parcelable;", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;", "selected", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;Lcom/robinhood/iso/countrycode/CountryCode;)V", "getContent", "()Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$CountryScreen;", "getSelected", "()Lcom/robinhood/iso/countrycode/CountryCode;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiDocumentRequestContent.CountryScreen content;
        private final CountryCode selected;

        /* compiled from: SddrCountryFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiDocumentRequestContent.CountryScreen) parcel.readParcelable(Args.class.getClassLoader()), (CountryCode) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiDocumentRequestContent.CountryScreen countryScreen, CountryCode countryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                countryScreen = args.content;
            }
            if ((i & 2) != 0) {
                countryCode = args.selected;
            }
            return args.copy(countryScreen, countryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDocumentRequestContent.CountryScreen getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final CountryCode getSelected() {
            return this.selected;
        }

        public final Args copy(ApiDocumentRequestContent.CountryScreen content, CountryCode selected) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Args(content, selected);
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
            return Intrinsics.areEqual(this.content, args.content) && Intrinsics.areEqual(this.selected, args.selected);
        }

        public int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            CountryCode countryCode = this.selected;
            return iHashCode + (countryCode == null ? 0 : countryCode.hashCode());
        }

        public String toString() {
            return "Args(content=" + this.content + ", selected=" + this.selected + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.content, flags);
            dest.writeSerializable(this.selected);
        }

        public Args(ApiDocumentRequestContent.CountryScreen content, CountryCode countryCode) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.selected = countryCode;
        }

        public final ApiDocumentRequestContent.CountryScreen getContent() {
            return this.content;
        }

        public final CountryCode getSelected() {
            return this.selected;
        }
    }

    /* compiled from: SddrCountryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SddrCountryFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SddrCountryFragment sddrCountryFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sddrCountryFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SddrCountryFragment newInstance(Args args) {
            return (SddrCountryFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SddrCountryFragment sddrCountryFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sddrCountryFragment, args);
        }
    }

    private static final SddrCountryViewState ComposeContent$lambda$0(SnapshotState4<? extends SddrCountryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
