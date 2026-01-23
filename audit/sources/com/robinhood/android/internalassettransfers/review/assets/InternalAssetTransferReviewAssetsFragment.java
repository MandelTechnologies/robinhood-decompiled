package com.robinhood.android.internalassettransfers.review.assets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview5;
import com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsFragment;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.internalassettransfers.review.models.UiAssets2;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferReviewAssetsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\b\u001a\u00020\tH\u0017¢\u0006\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferReviewAssetsFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* compiled from: InternalAssetTransferReviewAssetsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiAssets2.values().length];
            try {
                iArr[UiAssets2.TRANSFERABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiAssets2.NON_TRANSFERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(InternalAssetTransferReviewAssetsFragment internalAssetTransferReviewAssetsFragment, int i, Composer composer, int i2) {
        internalAssetTransferReviewAssetsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        String str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-288999179);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288999179, i2, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsFragment.ComposeContent (InternalAssetTransferReviewAssetsFragment.kt:24)");
            }
            Companion companion = INSTANCE;
            InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState = new InternalAssetTransferReviewAssetsViewState(((Args) companion.getArgs((Fragment) this)).getAssets(), ((Args) companion.getArgs((Fragment) this)).getFromHistory());
            Screen.Name name = Screen.Name.INTERNAL_ASSET_TRANSFER_ASSET_LIST;
            int i3 = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getAssets().getTransferability().ordinal()];
            if (i3 == 1) {
                str = InternalAssetTransferReview5.TRANSFERABLE_ASSETS_ROW_IDENTIFIER;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "non_transferable_assets";
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, null, str, null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) companion.getArgs((Fragment) this)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-664042592, true, new C192971(internalAssetTransferReviewAssetsViewState, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferReviewAssetsFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InternalAssetTransferReviewAssetsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsFragment$ComposeContent$1 */
    static final class C192971 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ InternalAssetTransferReviewAssetsViewState $viewState;
        final /* synthetic */ InternalAssetTransferReviewAssetsFragment this$0;

        C192971(InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState, InternalAssetTransferReviewAssetsFragment internalAssetTransferReviewAssetsFragment) {
            this.$viewState = internalAssetTransferReviewAssetsViewState;
            this.this$0 = internalAssetTransferReviewAssetsFragment;
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
                ComposerKt.traceEventStart(-664042592, i, -1, "com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsFragment.ComposeContent.<anonymous> (InternalAssetTransferReviewAssetsFragment.kt:42)");
            }
            InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState = this.$viewState;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final InternalAssetTransferReviewAssetsFragment internalAssetTransferReviewAssetsFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferReviewAssetsFragment.C192971.invoke$lambda$1$lambda$0(internalAssetTransferReviewAssetsFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
            final InternalAssetTransferReviewAssetsFragment internalAssetTransferReviewAssetsFragment2 = this.this$0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.review.assets.InternalAssetTransferReviewAssetsFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferReviewAssetsFragment.C192971.invoke$lambda$3$lambda$2(internalAssetTransferReviewAssetsFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            InternalAssetTransferReviewAssets3.InternalAssetTransferReviewAssets(internalAssetTransferReviewAssetsViewState, function0, (Function0) objRememberedValue2, ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferReviewAssetsFragment internalAssetTransferReviewAssetsFragment) {
            internalAssetTransferReviewAssetsFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(InternalAssetTransferReviewAssetsFragment internalAssetTransferReviewAssetsFragment) {
            internalAssetTransferReviewAssetsFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InternalAssetTransferReviewAssetsFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsFragment$Args;", "Landroid/os/Parcelable;", "assets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "source", "", "fromHistory", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Ljava/lang/String;Z)V", "getAssets", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getSource", "()Ljava/lang/String;", "getFromHistory", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiAssets assets;
        private final boolean fromHistory;
        private final String source;

        /* compiled from: InternalAssetTransferReviewAssetsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(UiAssets.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UiAssets uiAssets, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiAssets = args.assets;
            }
            if ((i & 2) != 0) {
                str = args.source;
            }
            if ((i & 4) != 0) {
                z = args.fromHistory;
            }
            return args.copy(uiAssets, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAssets getAssets() {
            return this.assets;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getFromHistory() {
            return this.fromHistory;
        }

        public final Args copy(UiAssets assets, String source, boolean fromHistory) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(assets, source, fromHistory);
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
            return Intrinsics.areEqual(this.assets, args.assets) && Intrinsics.areEqual(this.source, args.source) && this.fromHistory == args.fromHistory;
        }

        public int hashCode() {
            return (((this.assets.hashCode() * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.fromHistory);
        }

        public String toString() {
            return "Args(assets=" + this.assets + ", source=" + this.source + ", fromHistory=" + this.fromHistory + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.assets.writeToParcel(dest, flags);
            dest.writeString(this.source);
            dest.writeInt(this.fromHistory ? 1 : 0);
        }

        public Args(UiAssets assets, String source, boolean z) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(source, "source");
            this.assets = assets;
            this.source = source;
            this.fromHistory = z;
        }

        public /* synthetic */ Args(UiAssets uiAssets, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiAssets, str, (i & 4) != 0 ? false : z);
        }

        public final UiAssets getAssets() {
            return this.assets;
        }

        public final String getSource() {
            return this.source;
        }

        public final boolean getFromHistory() {
            return this.fromHistory;
        }
    }

    /* compiled from: InternalAssetTransferReviewAssetsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsFragment;", "Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsFragment$Args;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferAssetListFragmentKey;", "<init>", "()V", "createFragment", "key", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternalAssetTransferReviewAssetsFragment, Args>, FragmentResolver<InternalAssetTransferAssetListFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternalAssetTransferReviewAssetsFragment internalAssetTransferReviewAssetsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internalAssetTransferReviewAssetsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternalAssetTransferReviewAssetsFragment newInstance(Args args) {
            return (InternalAssetTransferReviewAssetsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternalAssetTransferReviewAssetsFragment internalAssetTransferReviewAssetsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internalAssetTransferReviewAssetsFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public InternalAssetTransferReviewAssetsFragment createFragment(InternalAssetTransferAssetListFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (InternalAssetTransferReviewAssetsFragment) newInstance((Parcelable) new Args(key.getAssets(), key.getSource(), key.getFromHistory()));
        }
    }
}
