package com.robinhood.android.privacysettings.p217ui.blocked;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.privacysettings.C25869R;
import com.robinhood.android.privacysettings.p217ui.PrivacySettingsDialogFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.social.p351ui.SocialBlockedUser;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BlockedProfilesFragment.kt */
@Metadata(m3635d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0011\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0019\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$²\u0006\n\u0010%\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "getAuthTokenManager", "()Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "setAuthTokenManager", "(Lcom/robinhood/shared/security/auth/token/AuthTokenManager;)V", "duxo", "Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesDuxo;", "getDuxo", "()Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "errorHandler", "com/robinhood/android/privacysettings/ui/blocked/BlockedProfilesFragment$errorHandler$2$1", "getErrorHandler", "()Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesFragment$errorHandler$2$1;", "errorHandler$delegate", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "bind", "state", "Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesViewState;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-privacy-settings_externalDebug", "viewState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BlockedProfilesFragment extends GenericComposeFragment {
    public AuthTokenManager authTokenManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, BlockedProfilesDuxo.class);

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BlockedProfilesFragment.errorHandler_delegate$lambda$0(this.f$0);
        }
    });
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(BlockedProfilesFragment blockedProfilesFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        blockedProfilesFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final AuthTokenManager getAuthTokenManager() {
        AuthTokenManager authTokenManager = this.authTokenManager;
        if (authTokenManager != null) {
            return authTokenManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authTokenManager");
        return null;
    }

    public final void setAuthTokenManager(AuthTokenManager authTokenManager) {
        Intrinsics.checkNotNullParameter(authTokenManager, "<set-?>");
        this.authTokenManager = authTokenManager;
    }

    private final BlockedProfilesDuxo getDuxo() {
        return (BlockedProfilesDuxo) this.duxo.getValue();
    }

    private final BlockedProfilesFragment2 getErrorHandler() {
        return (BlockedProfilesFragment2) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment$errorHandler$2$1] */
    public static final BlockedProfilesFragment2 errorHandler_delegate$lambda$0(final BlockedProfilesFragment blockedProfilesFragment) {
        final FragmentActivity fragmentActivityRequireActivity = blockedProfilesFragment.requireActivity();
        return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment$errorHandler$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivityRequireActivity, true, 0, null, 12, null);
                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showLongError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                PrivacySettingsDialogFragment.Companion companion = PrivacySettingsDialogFragment.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                RhDialogFragment.Builder message2 = companion.create(fragmentActivityRequireActivity2).setId(C11048R.id.dialog_id_generic_error).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
                FragmentManager supportFragmentManager = this.this$0.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message2, supportFragmentManager, "error", false, 4, null);
            }
        };
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2101947824);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2101947824, i2, -1, "com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment.ComposeContent (BlockedProfilesFragment.kt:42)");
            }
            final SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new BlockedProfilesViewState(false, false, null, null, null, null, 63, null), composerStartRestartGroup, 0);
            AuthTokenManager authTokenManager = getAuthTokenManager();
            boolean showUnblockDialog = ComposeContent$lambda$1(snapshotState4SubscribeAsState).getShowUnblockDialog();
            boolean zIsLoading = ComposeContent$lambda$1(snapshotState4SubscribeAsState).isLoading();
            List<SocialBlockedUser> blockedUsers = ComposeContent$lambda$1(snapshotState4SubscribeAsState).getBlockedUsers();
            SocialBlockedUser unblockDialogUser = ComposeContent$lambda$1(snapshotState4SubscribeAsState).getUnblockDialogUser();
            String fullName = unblockDialogUser != null ? unblockDialogUser.getFullName() : null;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(snapshotState4SubscribeAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlockedProfilesFragment.ComposeContent$lambda$3$lambda$2(this.f$0, snapshotState4SubscribeAsState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlockedProfilesFragment.ComposeContent$lambda$5$lambda$4(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlockedProfilesFragment.ComposeContent$lambda$7$lambda$6(this.f$0, (SocialBlockedUser) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BlockedProfilesComposable.BlockedProfilesComposable(authTokenManager, showUnblockDialog, zIsLoading, blockedUsers, fullName, function0, function02, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlockedProfilesFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(BlockedProfilesFragment blockedProfilesFragment, SnapshotState4 snapshotState4) {
        BlockedProfilesDuxo duxo = blockedProfilesFragment.getDuxo();
        SocialBlockedUser unblockDialogUser = ComposeContent$lambda$1(snapshotState4).getUnblockDialogUser();
        Intrinsics.checkNotNull(unblockDialogUser);
        duxo.unblockUser(unblockDialogUser);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(BlockedProfilesFragment blockedProfilesFragment) {
        blockedProfilesFragment.getDuxo().hideUnblockDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(BlockedProfilesFragment blockedProfilesFragment, SocialBlockedUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        blockedProfilesFragment.getDuxo().showUnblockDialog(user);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C258811(this));
    }

    /* compiled from: BlockedProfilesFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesFragment$onStart$1 */
    /* synthetic */ class C258811 extends FunctionReferenceImpl implements Function1<BlockedProfilesViewState, Unit> {
        C258811(Object obj) {
            super(1, obj, BlockedProfilesFragment.class, "bind", "bind(Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BlockedProfilesViewState blockedProfilesViewState) {
            invoke2(blockedProfilesViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BlockedProfilesViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BlockedProfilesFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(BlockedProfilesViewState state) {
        ErrorHandlers.handleErrorEvent(getErrorHandler(), state.getErrorEvent());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitle(getString(C25869R.string.blocked_profiles_toolbar_title));
    }

    /* compiled from: BlockedProfilesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$BlockedProfiles;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.BlockedProfiles> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.BlockedProfiles key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new BlockedProfilesFragment();
        }
    }

    private static final BlockedProfilesViewState ComposeContent$lambda$1(SnapshotState4<BlockedProfilesViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
