package com.robinhood.android.odyssey.lib.template.address;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.places.api.model.Place;
import com.robinhood.android.address.lib.places.Places2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment;
import com.robinhood.android.odyssey.lib.utils.ProgressBarUtils;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.serverdrivenui.page.ApiSdNavigationHeader;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdAddressStreetNumberFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\r\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdAddressStreetNumberFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdAddressStreetNumberFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdAddressStreetNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment$Callbacks;", "", "parentHeaderProgress", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "getParentHeaderProgress", "()Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "parentHeaderTitle", "", "getParentHeaderTitle", "()Ljava/lang/String;", "onStreetNumberInput", "", "place", "Lcom/google/android/libraries/places/api/model/Place;", "onDoNotHaveStreetNumber", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        ApiSdNavigationHeader.Progress getParentHeaderProgress();

        String getParentHeaderTitle();

        void onDoNotHaveStreetNumber(Place place);

        void onStreetNumberInput(Place place);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(SdAddressStreetNumberFragment sdAddressStreetNumberFragment, int i, Composer composer, int i2) {
        sdAddressStreetNumberFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        ApiSdNavigationHeader.Progress parentHeaderProgress = getCallbacks().getParentHeaderProgress();
        if (parentHeaderProgress != null) {
            ProgressBarUtils.updateProgress(toolbar.getProgressBar(), parentHeaderProgress);
        }
        super.configureToolbar(toolbar);
        String parentHeaderTitle = getCallbacks().getParentHeaderTitle();
        if (parentHeaderTitle != null) {
            new MutablePropertyReference0Impl(toolbar) { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment.configureToolbar.3
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((RhToolbar) this.receiver).getTitle();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((RhToolbar) this.receiver).setTitle((CharSequence) obj);
                }
            }.set(parentHeaderTitle);
        }
        toolbar.getProgressBar().setVisibility(parentHeaderProgress != null ? 0 : 8);
    }

    /* compiled from: SdAddressStreetNumberFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment$ComposeContent$1 */
    static final class C226721 implements Function2<Composer, Integer, Unit> {
        C226721() {
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
                ComposerKt.traceEventStart(-1178794669, i, -1, "com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment.ComposeContent.<anonymous> (SdAddressStreetNumberFragment.kt:47)");
            }
            String address = ((Args) SdAddressStreetNumberFragment.INSTANCE.getArgs((Fragment) SdAddressStreetNumberFragment.this)).getPlace().getAddress();
            if (address == null) {
                address = "";
            }
            String str = address;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(SdAddressStreetNumberFragment.this);
            final SdAddressStreetNumberFragment sdAddressStreetNumberFragment = SdAddressStreetNumberFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdAddressStreetNumberFragment.C226721.invoke$lambda$1$lambda$0(sdAddressStreetNumberFragment, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(SdAddressStreetNumberFragment.this);
            final SdAddressStreetNumberFragment sdAddressStreetNumberFragment2 = SdAddressStreetNumberFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SdAddressStreetNumberFragment.C226721.invoke$lambda$3$lambda$2(sdAddressStreetNumberFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            SdAddressStreetNumberComposable.SdAddressStreetNumberComposable(str, function1, (Function0) objRememberedValue2, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SdAddressStreetNumberFragment sdAddressStreetNumberFragment, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Callbacks callbacks = sdAddressStreetNumberFragment.getCallbacks();
            Place placeBuild = Places2.setStreetNumber(Places2.buildUpon(((Args) SdAddressStreetNumberFragment.INSTANCE.getArgs((Fragment) sdAddressStreetNumberFragment)).getPlace()), it).build();
            Intrinsics.checkNotNullExpressionValue(placeBuild, "build(...)");
            callbacks.onStreetNumberInput(placeBuild);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SdAddressStreetNumberFragment sdAddressStreetNumberFragment) {
            sdAddressStreetNumberFragment.getCallbacks().onDoNotHaveStreetNumber(((Args) SdAddressStreetNumberFragment.INSTANCE.getArgs((Fragment) sdAddressStreetNumberFragment)).getPlace());
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2111092856);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2111092856, i2, -1, "com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment.ComposeContent (SdAddressStreetNumberFragment.kt:45)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1178794669, true, new C226721(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.template.address.SdAddressStreetNumberFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdAddressStreetNumberFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SdAddressStreetNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment$Args;", "Landroid/os/Parcelable;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "<init>", "(Lcom/google/android/libraries/places/api/model/Place;)V", "getPlace", "()Lcom/google/android/libraries/places/api/model/Place;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Place place;

        /* compiled from: SdAddressStreetNumberFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Place) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Place place, int i, Object obj) {
            if ((i & 1) != 0) {
                place = args.place;
            }
            return args.copy(place);
        }

        /* renamed from: component1, reason: from getter */
        public final Place getPlace() {
            return this.place;
        }

        public final Args copy(Place place) {
            Intrinsics.checkNotNullParameter(place, "place");
            return new Args(place);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.place, ((Args) other).place);
        }

        public int hashCode() {
            return this.place.hashCode();
        }

        public String toString() {
            return "Args(place=" + this.place + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.place, flags);
        }

        public Args(Place place) {
            Intrinsics.checkNotNullParameter(place, "place");
            this.place = place;
        }

        public final Place getPlace() {
            return this.place;
        }
    }

    /* compiled from: SdAddressStreetNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment;", "Lcom/robinhood/android/odyssey/lib/template/address/SdAddressStreetNumberFragment$Args;", "<init>", "()V", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SdAddressStreetNumberFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SdAddressStreetNumberFragment sdAddressStreetNumberFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sdAddressStreetNumberFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SdAddressStreetNumberFragment newInstance(Args args) {
            return (SdAddressStreetNumberFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SdAddressStreetNumberFragment sdAddressStreetNumberFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sdAddressStreetNumberFragment, args);
        }
    }
}
