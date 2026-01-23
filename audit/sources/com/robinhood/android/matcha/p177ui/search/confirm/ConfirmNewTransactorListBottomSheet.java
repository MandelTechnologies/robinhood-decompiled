package com.robinhood.android.matcha.p177ui.search.confirm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.common.RosettaConverters;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmNewTransactorListBottomSheet;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: ConfirmNewTransactorListBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0003 !\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u001d\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010\u001fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ConfirmNewTransactorListBottomSheet extends GenericComposeBottomSheetDialogFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ConfirmNewTransactorListBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ConfirmNewTransactorListBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet$Callbacks;", "", "launchUserProfile", "", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "onTransactorListConfirmed", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void launchUserProfile(Transactor.User transactor);

        void onTransactorListConfirmed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet, int i, Composer composer, int i2) {
        confirmNewTransactorListBottomSheet.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.P2P_SEARCH, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        Context.ProductTag productTag = Context.ProductTag.PEER_TO_PEER;
        List<Transactor> firstTimeTransactors = ((Args) INSTANCE.getArgs((Fragment) this)).getFirstTimeTransactors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(firstTimeTransactors, 10));
        Iterator<T> it = firstTimeTransactors.iterator();
        while (it.hasNext()) {
            arrayList.add(RosettaConverters.toTargetType((Transactor) it.next()));
        }
        return new Context(0, 0, 0, null, null, null, null, productTag, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new P2PContext(null, null, 0.0f, null, arrayList, null, 47, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -1, -268435457, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return UserInteractionEventData.copy$default(AutoLoggableFragment.DefaultImpls.getScreenEventData(this), null, null, new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, null, null, null, 123, null);
    }

    /* compiled from: ConfirmNewTransactorListBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet$ComposeContent$1 */
    static final class C215461 implements Function2<Composer, Integer, Unit> {
        C215461() {
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
                ComposerKt.traceEventStart(-564427070, i, -1, "com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet.ComposeContent.<anonymous> (ConfirmNewTransactorListBottomSheet.kt:53)");
            }
            ImmutableList immutableList = extensions2.toImmutableList(((Args) ConfirmNewTransactorListBottomSheet.INSTANCE.getArgs((Fragment) ConfirmNewTransactorListBottomSheet.this)).getFirstTimeTransactors());
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(ConfirmNewTransactorListBottomSheet.this);
            final ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet = ConfirmNewTransactorListBottomSheet.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ConfirmNewTransactorListBottomSheet.C215461.invoke$lambda$1$lambda$0(confirmNewTransactorListBottomSheet, (Transactor.User) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(ConfirmNewTransactorListBottomSheet.this);
            final ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet2 = ConfirmNewTransactorListBottomSheet.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConfirmNewTransactorListBottomSheet.C215461.invoke$lambda$3$lambda$2(confirmNewTransactorListBottomSheet2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(ConfirmNewTransactorListBottomSheet.this);
            final ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet3 = ConfirmNewTransactorListBottomSheet.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConfirmNewTransactorListBottomSheet.C215461.invoke$lambda$5$lambda$4(confirmNewTransactorListBottomSheet3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ConfirmNewTransactorList.ConfirmNewTransactorList(immutableList, function1, function0, (Function0) objRememberedValue3, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet, Transactor.User transactor) {
            Intrinsics.checkNotNullParameter(transactor, "transactor");
            EventLogger.DefaultImpls.logTap$default(confirmNewTransactorListBottomSheet.getEventLogger(), UserInteractionEventData.Action.REVIEW_INVESTOR_PROFILE, confirmNewTransactorListBottomSheet.getEventScreen(), new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, confirmNewTransactorListBottomSheet.getScreenEventContext(), false, 40, null);
            confirmNewTransactorListBottomSheet.getCallbacks().launchUserProfile(transactor);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet) {
            EventLogger.DefaultImpls.logTap$default(confirmNewTransactorListBottomSheet.getEventLogger(), UserInteractionEventData.Action.CONTINUE, confirmNewTransactorListBottomSheet.getEventScreen(), new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, confirmNewTransactorListBottomSheet.getScreenEventContext(), false, 40, null);
            confirmNewTransactorListBottomSheet.getCallbacks().onTransactorListConfirmed();
            confirmNewTransactorListBottomSheet.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet) {
            EventLogger.DefaultImpls.logTap$default(confirmNewTransactorListBottomSheet.getEventLogger(), UserInteractionEventData.Action.CANCEL, confirmNewTransactorListBottomSheet.getEventScreen(), new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, confirmNewTransactorListBottomSheet.getScreenEventContext(), false, 40, null);
            confirmNewTransactorListBottomSheet.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1349336073);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1349336073, i2, -1, "com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet.ComposeContent (ConfirmNewTransactorListBottomSheet.kt:51)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-564427070, true, new C215461(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConfirmNewTransactorListBottomSheet.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ConfirmNewTransactorListBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet$Args;", "Landroid/os/Parcelable;", "firstTimeTransactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Ljava/util/List;)V", "getFirstTimeTransactors", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<Transactor> firstTimeTransactors;

        /* compiled from: ConfirmNewTransactorListBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Transactor> list = this.firstTimeTransactors;
            dest.writeInt(list.size());
            Iterator<Transactor> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(List<? extends Transactor> firstTimeTransactors) {
            Intrinsics.checkNotNullParameter(firstTimeTransactors, "firstTimeTransactors");
            this.firstTimeTransactors = firstTimeTransactors;
        }

        public final List<Transactor> getFirstTimeTransactors() {
            return this.firstTimeTransactors;
        }
    }

    /* compiled from: ConfirmNewTransactorListBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ConfirmNewTransactorListBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, confirmNewTransactorListBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ConfirmNewTransactorListBottomSheet newInstance(Args args) {
            return (ConfirmNewTransactorListBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, confirmNewTransactorListBottomSheet, args);
        }
    }
}
