package com.robinhood.android.privacysettings.p217ui.blocked;

import com.robinhood.android.store.social.SocialBlockingStore;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.bonfire.ApiSocialBlockingResponse;
import com.robinhood.models.social.p351ui.SocialBlockedUser;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockedProfilesDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesViewState;", "blockingStore", "Lcom/robinhood/android/store/social/SocialBlockingStore;", "<init>", "(Lcom/robinhood/android/store/social/SocialBlockingStore;)V", "onCreate", "", "hideUnblockDialog", "showUnblockDialog", "user", "Lcom/robinhood/models/social/ui/SocialBlockedUser;", "unblockUser", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class BlockedProfilesDuxo extends OldBaseDuxo<BlockedProfilesViewState> {
    public static final int $stable = 8;
    private final SocialBlockingStore blockingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockedProfilesDuxo(SocialBlockingStore blockingStore) {
        super(new BlockedProfilesViewState(false, false, null, null, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(blockingStore, "blockingStore");
        this.blockingStore = blockingStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.blockingStore.streamBlockedUsers(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.onCreate$lambda$1(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.onCreate$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BlockedProfilesDuxo blockedProfilesDuxo, final List blockedUsers) {
        Intrinsics.checkNotNullParameter(blockedUsers, "blockedUsers");
        blockedProfilesDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.onCreate$lambda$1$lambda$0(blockedUsers, (BlockedProfilesViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedProfilesViewState onCreate$lambda$1$lambda$0(List list, BlockedProfilesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BlockedProfilesViewState.copy$default(applyMutation, false, false, null, null, CollectionsKt.plus((Collection) applyMutation.getUsers(), (Iterable) list), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(BlockedProfilesDuxo blockedProfilesDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            blockedProfilesDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlockedProfilesDuxo.onCreate$lambda$3$lambda$2(t, (BlockedProfilesViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedProfilesViewState onCreate$lambda$3$lambda$2(Throwable th, BlockedProfilesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BlockedProfilesViewState.copy$default(applyMutation, false, false, null, new UiEvent(th), null, null, 54, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedProfilesViewState hideUnblockDialog$lambda$4(BlockedProfilesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BlockedProfilesViewState.copy$default(applyMutation, false, false, null, null, null, null, 61, null);
    }

    public final void hideUnblockDialog() {
        applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.hideUnblockDialog$lambda$4((BlockedProfilesViewState) obj);
            }
        });
    }

    public final void showUnblockDialog(final SocialBlockedUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.showUnblockDialog$lambda$5(user, (BlockedProfilesViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedProfilesViewState showUnblockDialog$lambda$5(SocialBlockedUser socialBlockedUser, BlockedProfilesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BlockedProfilesViewState.copy$default(applyMutation, false, true, socialBlockedUser, null, null, null, 57, null);
    }

    public final void unblockUser(SocialBlockedUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.unblockUser$lambda$6((BlockedProfilesViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.blockingStore.unblockUser(user.getRelationshipId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.unblockUser$lambda$8(this.f$0, (ApiSocialBlockingResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.unblockUser$lambda$10(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedProfilesViewState unblockUser$lambda$6(BlockedProfilesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BlockedProfilesViewState.copy$default(applyMutation, true, false, null, null, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unblockUser$lambda$8(BlockedProfilesDuxo blockedProfilesDuxo, final ApiSocialBlockingResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        blockedProfilesDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedProfilesDuxo.unblockUser$lambda$8$lambda$7(response, (BlockedProfilesViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedProfilesViewState unblockUser$lambda$8$lambda$7(ApiSocialBlockingResponse apiSocialBlockingResponse, BlockedProfilesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BlockedProfilesViewState.copy$default(applyMutation, false, false, null, null, null, CollectionsKt.plus((Collection<? extends ApiSocialBlockingResponse>) applyMutation.getBlockingResponses(), apiSocialBlockingResponse), 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unblockUser$lambda$10(BlockedProfilesDuxo blockedProfilesDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            blockedProfilesDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.blocked.BlockedProfilesDuxo$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlockedProfilesDuxo.unblockUser$lambda$10$lambda$9(t, (BlockedProfilesViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedProfilesViewState unblockUser$lambda$10$lambda$9(Throwable th, BlockedProfilesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return BlockedProfilesViewState.copy$default(applyMutation, false, false, null, new UiEvent(th), null, null, 54, null);
    }
}
