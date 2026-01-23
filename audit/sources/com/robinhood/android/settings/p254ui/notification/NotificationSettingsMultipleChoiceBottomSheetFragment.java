package com.robinhood.android.settings.p254ui.notification;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsMultipleChoiceBottomSheetFragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: NotificationSettingsMultipleChoiceBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\r\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "selectedValues", "", "", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismiss", "activity", "Landroid/app/Activity;", "Callbacks", "Args", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSettingsMultipleChoiceBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof NotificationSettingsMultipleChoiceBottomSheetFragment.Callbacks)) {
                parentFragment = null;
            }
            NotificationSettingsMultipleChoiceBottomSheetFragment.Callbacks callbacks = (NotificationSettingsMultipleChoiceBottomSheetFragment.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof NotificationSettingsMultipleChoiceBottomSheetFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private Set<String> selectedValues = SetsKt.emptySet();
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotificationSettingsMultipleChoiceBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NotificationSettingsMultipleChoiceBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Callbacks;", "", "onBottomSheetMultipleChoiceSelectionCompleted", "", "itemId", "", "parentId", "selectedValues", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBottomSheetMultipleChoiceSelectionCompleted(String itemId, String parentId, Set<String> selectedValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(NotificationSettingsMultipleChoiceBottomSheetFragment notificationSettingsMultipleChoiceBottomSheetFragment, int i, Composer composer, int i2) {
        notificationSettingsMultipleChoiceBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1250845975);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1250845975, i2, -1, "com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetFragment.ComposeContent (NotificationSettingsMultipleChoiceBottomSheetFragment.kt:29)");
            }
            Args args = (Args) INSTANCE.getArgs((Fragment) this);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NotificationSettingsMultipleChoiceBottomSheetFragment.ComposeContent$lambda$1$lambda$0(this.f$0, (Set) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new NotificationSettingsMultipleChoiceBottomSheetFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            NotificationSettingsMultipleChoiceBottomSheetComposable.NotificationSettingsMultipleChoiceBottomSheetComposable(args, function1, (Function0) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettingsMultipleChoiceBottomSheetFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(NotificationSettingsMultipleChoiceBottomSheetFragment notificationSettingsMultipleChoiceBottomSheetFragment, Set it) {
        Intrinsics.checkNotNullParameter(it, "it");
        notificationSettingsMultipleChoiceBottomSheetFragment.selectedValues = it;
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onDismiss(activity);
        if (requireActivity().isChangingConfigurations()) {
            return;
        }
        Callbacks callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onBottomSheetMultipleChoiceSelectionCompleted(((Args) companion.getArgs((Fragment) this)).getId(), ((Args) companion.getArgs((Fragment) this)).getParentId(), this.selectedValues);
    }

    /* compiled from: NotificationSettingsMultipleChoiceBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00017B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003Jq\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "parentId", "", "id", "title", "subtitle", InquiryField.ChoicesField.TYPE, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Args$ChoiceItem;", "selectedValues", "Lkotlinx/collections/immutable/ImmutableSet;", "canSelectMultiple", "", "rootIdentifier", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableSet;ZLjava/lang/String;)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getParentId", "()Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getChoices", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedValues", "()Lkotlinx/collections/immutable/ImmutableSet;", "getCanSelectMultiple", "()Z", "getRootIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ChoiceItem", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean canSelectMultiple;
        private final ImmutableList<ChoiceItem> choices;
        private final String id;
        private final String parentId;
        private final String rootIdentifier;
        private final Screen screen;
        private final ImmutableSet<String> selectedValues;
        private final String subtitle;
        private final String title;

        /* compiled from: NotificationSettingsMultipleChoiceBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Screen screen = (Screen) parcel.readSerializable();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ChoiceItem.CREATOR.createFromParcel(parcel));
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(screen, string2, string3, string4, string5, persistentList, extensions2.toPersistentSet(linkedHashSet), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Screen screen, String str, String str2, String str3, String str4, ImmutableList immutableList, ImmutableSet immutableSet, boolean z, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                screen = args.screen;
            }
            if ((i & 2) != 0) {
                str = args.parentId;
            }
            if ((i & 4) != 0) {
                str2 = args.id;
            }
            if ((i & 8) != 0) {
                str3 = args.title;
            }
            if ((i & 16) != 0) {
                str4 = args.subtitle;
            }
            if ((i & 32) != 0) {
                immutableList = args.choices;
            }
            if ((i & 64) != 0) {
                immutableSet = args.selectedValues;
            }
            if ((i & 128) != 0) {
                z = args.canSelectMultiple;
            }
            if ((i & 256) != 0) {
                str5 = args.rootIdentifier;
            }
            boolean z2 = z;
            String str6 = str5;
            ImmutableList immutableList2 = immutableList;
            ImmutableSet immutableSet2 = immutableSet;
            String str7 = str4;
            String str8 = str2;
            return args.copy(screen, str, str8, str3, str7, immutableList2, immutableSet2, z2, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final Screen getScreen() {
            return this.screen;
        }

        /* renamed from: component2, reason: from getter */
        public final String getParentId() {
            return this.parentId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ImmutableList<ChoiceItem> component6() {
            return this.choices;
        }

        public final ImmutableSet<String> component7() {
            return this.selectedValues;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getCanSelectMultiple() {
            return this.canSelectMultiple;
        }

        /* renamed from: component9, reason: from getter */
        public final String getRootIdentifier() {
            return this.rootIdentifier;
        }

        public final Args copy(Screen screen, String parentId, String id, String title, String subtitle, ImmutableList<ChoiceItem> choices, ImmutableSet<String> selectedValues, boolean canSelectMultiple, String rootIdentifier) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(parentId, "parentId");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(choices, "choices");
            Intrinsics.checkNotNullParameter(selectedValues, "selectedValues");
            Intrinsics.checkNotNullParameter(rootIdentifier, "rootIdentifier");
            return new Args(screen, parentId, id, title, subtitle, choices, selectedValues, canSelectMultiple, rootIdentifier);
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
            return Intrinsics.areEqual(this.screen, args.screen) && Intrinsics.areEqual(this.parentId, args.parentId) && Intrinsics.areEqual(this.id, args.id) && Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.subtitle, args.subtitle) && Intrinsics.areEqual(this.choices, args.choices) && Intrinsics.areEqual(this.selectedValues, args.selectedValues) && this.canSelectMultiple == args.canSelectMultiple && Intrinsics.areEqual(this.rootIdentifier, args.rootIdentifier);
        }

        public int hashCode() {
            int iHashCode = ((((((this.screen.hashCode() * 31) + this.parentId.hashCode()) * 31) + this.id.hashCode()) * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.choices.hashCode()) * 31) + this.selectedValues.hashCode()) * 31) + Boolean.hashCode(this.canSelectMultiple)) * 31) + this.rootIdentifier.hashCode();
        }

        public String toString() {
            return "Args(screen=" + this.screen + ", parentId=" + this.parentId + ", id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", choices=" + this.choices + ", selectedValues=" + this.selectedValues + ", canSelectMultiple=" + this.canSelectMultiple + ", rootIdentifier=" + this.rootIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screen);
            dest.writeString(this.parentId);
            dest.writeString(this.id);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            ImmutableList<ChoiceItem> immutableList = this.choices;
            dest.writeInt(immutableList.size());
            Iterator<ChoiceItem> it = immutableList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            ImmutableSet<String> immutableSet = this.selectedValues;
            dest.writeInt(immutableSet.size());
            Iterator<String> it2 = immutableSet.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next());
            }
            dest.writeInt(this.canSelectMultiple ? 1 : 0);
            dest.writeString(this.rootIdentifier);
        }

        public Args(Screen screen, String parentId, String id, String title, String str, ImmutableList<ChoiceItem> choices, ImmutableSet<String> selectedValues, boolean z, String rootIdentifier) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(parentId, "parentId");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(choices, "choices");
            Intrinsics.checkNotNullParameter(selectedValues, "selectedValues");
            Intrinsics.checkNotNullParameter(rootIdentifier, "rootIdentifier");
            this.screen = screen;
            this.parentId = parentId;
            this.id = id;
            this.title = title;
            this.subtitle = str;
            this.choices = choices;
            this.selectedValues = selectedValues;
            this.canSelectMultiple = z;
            this.rootIdentifier = rootIdentifier;
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final String getParentId() {
            return this.parentId;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ImmutableList<ChoiceItem> getChoices() {
            return this.choices;
        }

        public final ImmutableSet<String> getSelectedValues() {
            return this.selectedValues;
        }

        public final boolean getCanSelectMultiple() {
            return this.canSelectMultiple;
        }

        public final String getRootIdentifier() {
            return this.rootIdentifier;
        }

        /* compiled from: NotificationSettingsMultipleChoiceBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Args$ChoiceItem;", "Landroid/os/Parcelable;", "value", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ChoiceItem implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ChoiceItem> CREATOR = new Creator();
            private final String title;
            private final String value;

            /* compiled from: NotificationSettingsMultipleChoiceBottomSheetFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ChoiceItem> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ChoiceItem createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ChoiceItem(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ChoiceItem[] newArray(int i) {
                    return new ChoiceItem[i];
                }
            }

            public static /* synthetic */ ChoiceItem copy$default(ChoiceItem choiceItem, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = choiceItem.value;
                }
                if ((i & 2) != 0) {
                    str2 = choiceItem.title;
                }
                return choiceItem.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final ChoiceItem copy(String value, String title) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(title, "title");
                return new ChoiceItem(value, title);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChoiceItem)) {
                    return false;
                }
                ChoiceItem choiceItem = (ChoiceItem) other;
                return Intrinsics.areEqual(this.value, choiceItem.value) && Intrinsics.areEqual(this.title, choiceItem.title);
            }

            public int hashCode() {
                return (this.value.hashCode() * 31) + this.title.hashCode();
            }

            public String toString() {
                return "ChoiceItem(value=" + this.value + ", title=" + this.title + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.value);
                dest.writeString(this.title);
            }

            public ChoiceItem(String value, String title) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(title, "title");
                this.value = value;
                this.title = title;
            }

            public final String getValue() {
                return this.value;
            }

            public final String getTitle() {
                return this.title;
            }
        }
    }

    /* compiled from: NotificationSettingsMultipleChoiceBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/DialogFragmentWithArgsCompanion;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Args;", "<init>", "()V", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentWithArgsCompanion<NotificationSettingsMultipleChoiceBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(NotificationSettingsMultipleChoiceBottomSheetFragment notificationSettingsMultipleChoiceBottomSheetFragment) {
            return (Args) DialogFragmentWithArgsCompanion.DefaultImpls.getArgs(this, notificationSettingsMultipleChoiceBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion
        public NotificationSettingsMultipleChoiceBottomSheetFragment newInstance(Args args, int i) {
            return (NotificationSettingsMultipleChoiceBottomSheetFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance(this, args, i);
        }
    }
}
