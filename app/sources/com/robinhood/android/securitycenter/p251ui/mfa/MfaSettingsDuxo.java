package com.robinhood.android.securitycenter.p251ui.mfa;

import android.content.Context;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.SecurityCenterConstants;
import com.robinhood.android.settings.util.MfaManager;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.Mfa;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import io.noties.markwon.Markwon;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: MfaSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState;", "mfaManager", "Lcom/robinhood/android/settings/util/MfaManager;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "appContext", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/android/settings/util/MfaManager;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/contentful/StaticContentStore;Lio/noties/markwon/Markwon;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/app/type/AppType;Landroid/content/Context;)V", "onStart", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MfaSettingsDuxo extends OldBaseDuxo<MfaSettingsViewState> {
    public static final int $stable = 8;
    private final Context appContext;
    private final AppType appType;
    private final Markwon markwon;
    private final MfaManager mfaManager;
    private final ProfileInfoStore profileInfoStore;
    private final StaticContentStore staticContentStore;
    private final UserStore userStore;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MfaSettingsDuxo(MfaManager mfaManager, ProfileInfoStore profileInfoStore, StaticContentStore staticContentStore, Markwon markwon, UserStore userStore, AppType appType, Context appContext) {
        Intrinsics.checkNotNullParameter(mfaManager, "mfaManager");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        boolean z = appType == AppType.RHC;
        super(new MfaSettingsViewState(null, null, null, null, z, null, 47, null), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        this.mfaManager = mfaManager;
        this.profileInfoStore = profileInfoStore;
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
        this.userStore = userStore;
        this.appType = appType;
        this.appContext = appContext;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        UserStore.refresh$default(this.userStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSettingsDuxo.onStart$lambda$1(this.f$0, (User) obj);
            }
        });
        ProfileInfoStore.refreshProfileInfo$default(this.profileInfoStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.profileInfoStore.streamProfileInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSettingsDuxo.onStart$lambda$3(this.f$0, (UiProfileInfo) obj);
            }
        });
        this.mfaManager.refresh();
        LifecycleHost.DefaultImpls.bind$default(this, this.mfaManager.getMfaObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSettingsDuxo.onStart$lambda$5(this.f$0, (Mfa) obj);
            }
        });
        if (this.appType != AppType.RHC) {
            Single singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C282594(null), 1, null).subscribeOn(Schedulers.m3346io());
            Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleSubscribeOn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MfaSettingsDuxo.onStart$lambda$7(this.f$0, (String) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MfaSettingsDuxo.onStart$lambda$9(this.f$0, (Throwable) obj);
                }
            });
        } else {
            final String string2 = this.appContext.getString(C28186R.string.gated_crypto_setting_mfa_subtitle_markdown_rhc);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MfaSettingsDuxo.onStart$lambda$10(this.f$0, string2, (MfaSettingsViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MfaSettingsDuxo mfaSettingsDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        mfaSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSettingsDuxo.onStart$lambda$1$lambda$0(user, (MfaSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaSettingsViewState onStart$lambda$1$lambda$0(User user, MfaSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MfaSettingsViewState.copy$default(applyMutation, null, null, null, null, false, user, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(MfaSettingsDuxo mfaSettingsDuxo, final UiProfileInfo profileInfo) {
        Intrinsics.checkNotNullParameter(profileInfo, "profileInfo");
        mfaSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSettingsDuxo.onStart$lambda$3$lambda$2(profileInfo, (MfaSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaSettingsViewState onStart$lambda$3$lambda$2(UiProfileInfo uiProfileInfo, MfaSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MfaSettingsViewState.copy$default(applyMutation, null, null, null, uiProfileInfo.getPhoneNumber(), false, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(MfaSettingsDuxo mfaSettingsDuxo, final Mfa mfa) {
        Intrinsics.checkNotNullParameter(mfa, "mfa");
        mfaSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSettingsDuxo.onStart$lambda$5$lambda$4(mfa, (MfaSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaSettingsViewState onStart$lambda$5$lambda$4(Mfa mfa, MfaSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MfaSettingsViewState.copy$default(applyMutation, null, null, mfa, null, false, null, 59, null);
    }

    /* compiled from: MfaSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$onStart$4", m3645f = "MfaSettingsDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$onStart$4 */
    static final class C282594 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        C282594(Continuation<? super C282594> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaSettingsDuxo.this.new C282594(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C282594) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = MfaSettingsDuxo.this.staticContentStore;
                this.label = 1;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, SecurityCenterConstants.MFA_SETTINGS_SUBTITLE_CONTENTFUL_ID, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((OtherMarkdown) ((EntryResource) obj).getValue()).getMarkdown2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(final MfaSettingsDuxo mfaSettingsDuxo, final String str) {
        mfaSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSettingsDuxo.onStart$lambda$7$lambda$6(this.f$0, str, (MfaSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaSettingsViewState onStart$lambda$7$lambda$6(MfaSettingsDuxo mfaSettingsDuxo, String str, MfaSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Markwon markwon = mfaSettingsDuxo.markwon;
        Intrinsics.checkNotNull(str);
        return MfaSettingsViewState.copy$default(applyMutation, Markwons.toSpanned$default(markwon, new MarkdownContent(str), null, 2, null), null, null, null, false, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(MfaSettingsDuxo mfaSettingsDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Timber.INSTANCE.mo3355e(t, "Failed to load Contentful parcel", new Object[0]);
        mfaSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSettingsDuxo.onStart$lambda$9$lambda$8(t, (MfaSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaSettingsViewState onStart$lambda$9$lambda$8(Throwable th, MfaSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MfaSettingsViewState.copy$default(applyMutation, null, new UiEvent(th), null, null, false, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MfaSettingsViewState onStart$lambda$10(MfaSettingsDuxo mfaSettingsDuxo, String str, MfaSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MfaSettingsViewState.copy$default(applyMutation, Markwons.toSpanned$default(mfaSettingsDuxo.markwon, new MarkdownContent(str), null, 2, null), null, null, null, false, null, 62, null);
    }
}
