package com.robinhood.librobinhood.data.store;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.data.store.referral.C13878R;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.PostOnboardingFundAccountContentResponse;
import com.robinhood.models.api.PostOnboardingFundAccountDetailScreenContent;
import com.robinhood.models.api.PostOnboardingFundAccountSplashScreenContent;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.ImageSource;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.RichTextAttribute;
import com.robinhood.models.serverdriven.experimental.api.RichTextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithIcon;
import com.robinhood.prefs.Installation;
import com.robinhood.referral.api.FundAccountScreenApi;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: FundAccountScreenStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "Lcom/robinhood/store/Store;", "resources", "Landroid/content/res/Resources;", "api", "Lcom/robinhood/referral/api/FundAccountScreenApi;", "installation", "Lcom/robinhood/prefs/Installation;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/referral/api/FundAccountScreenApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/store/StoreBundle;)V", "contentRelay", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/api/PostOnboardingFundAccountContentResponse;", "fetchIfEmpty", "", "getFallbackResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamFundAccountScreenResponse", "Lkotlinx/coroutines/flow/Flow;", "getFallbackResponseUS", "getFallbackResponseGB", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class FundAccountScreenStore extends Store {
    private final FundAccountScreenApi api;
    private final AppType appType;
    private final StateFlow2<PostOnboardingFundAccountContentResponse> contentRelay;
    private final Installation installation;
    private final Resources resources;
    private final UserStore userStore;

    /* compiled from: FundAccountScreenStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.FundAccountScreenStore", m3645f = "FundAccountScreenStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "getFallbackResponse")
    /* renamed from: com.robinhood.librobinhood.data.store.FundAccountScreenStore$getFallbackResponse$1 */
    static final class C338671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C338671(Continuation<? super C338671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FundAccountScreenStore.this.getFallbackResponse(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundAccountScreenStore(Resources resources, FundAccountScreenApi api, Installation installation, UserStore userStore, AppType appType, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.resources = resources;
        this.api = api;
        this.installation = installation;
        this.userStore = userStore;
        this.appType = appType;
        this.contentRelay = StateFlow4.MutableStateFlow(null);
    }

    /* compiled from: FundAccountScreenStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.FundAccountScreenStore$fetchIfEmpty$1", m3645f = "FundAccountScreenStore.kt", m3646l = {46, 48, 52, 57}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.FundAccountScreenStore$fetchIfEmpty$1 */
    static final class C338661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C338661(Continuation<? super C338661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FundAccountScreenStore.this.new C338661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        
            if (r7 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PostOnboardingFundAccountContentResponse postOnboardingFundAccountContentResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Timber.INSTANCE.mo3355e(th, "Failed to fetch fund account screen content", new Object[0]);
                if (FundAccountScreenStore.this.appType != AppType.RHC) {
                    FundAccountScreenStore fundAccountScreenStore = FundAccountScreenStore.this;
                    this.label = 3;
                    obj = fundAccountScreenStore.getFallbackResponse(this);
                } else {
                    postOnboardingFundAccountContentResponse = null;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = FundAccountScreenStore.this.contentRelay;
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow2, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    postOnboardingFundAccountContentResponse = (PostOnboardingFundAccountContentResponse) obj;
                    if (postOnboardingFundAccountContentResponse != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                postOnboardingFundAccountContentResponse = (PostOnboardingFundAccountContentResponse) obj;
                if (postOnboardingFundAccountContentResponse != null) {
                    StateFlow2 stateFlow22 = FundAccountScreenStore.this.contentRelay;
                    this.label = 4;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (obj == null) {
                FundAccountScreenApi fundAccountScreenApi = FundAccountScreenStore.this.api;
                String strMo2745id = FundAccountScreenStore.this.installation.mo2745id();
                this.label = 2;
                obj = fundAccountScreenApi.getFundAccountScreenContent(strMo2745id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                postOnboardingFundAccountContentResponse = (PostOnboardingFundAccountContentResponse) obj;
                if (postOnboardingFundAccountContentResponse != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void fetchIfEmpty() {
        BuildersKt__Builders_commonKt.launch$default(getLogoutKillswitch().getLoggedInScope(), null, null, new C338661(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFallbackResponse(Continuation<? super PostOnboardingFundAccountContentResponse> continuation) {
        C338671 c338671;
        if (continuation instanceof C338671) {
            c338671 = (C338671) continuation;
            int i = c338671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338671.label = i - Integer.MIN_VALUE;
            } else {
                c338671 = new C338671(continuation);
            }
        }
        Object objAwaitFirst = c338671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            UserStore.refresh$default(this.userStore, false, 1, null);
            Observable<User> user = this.userStore.getUser();
            c338671.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(user, c338671);
            if (objAwaitFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
        }
        CountryCode.Supported locality = ((User) objAwaitFirst).getOrigin().getLocality();
        if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
            return getFallbackResponseUS();
        }
        if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return getFallbackResponseGB();
        }
        if (Intrinsics.areEqual(locality, CountryCode.Supported.Singapore.INSTANCE)) {
            return null;
        }
        throw new IllegalStateException(("Unsupported locality: " + locality).toString());
    }

    public final Flow<PostOnboardingFundAccountContentResponse> streamFundAccountScreenResponse() {
        fetchIfEmpty();
        return this.contentRelay;
    }

    private final PostOnboardingFundAccountContentResponse getFallbackResponseUS() throws Resources.NotFoundException {
        String string2 = this.resources.getString(C13878R.string.fund_account_splash_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RichText richText = new RichText(string2, CollectionsKt.emptyList());
        String string3 = this.resources.getString(C13878R.string.fund_account_splash_subtitle);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        RichText richText2 = new RichText(string3, CollectionsKt.emptyList());
        ImageSource imageSource = new ImageSource("https://cdn.robinhood.com/app_assets/fund_account/control/1x.png", "https://cdn.robinhood.com/app_assets/fund_account/control/2x.png", "https://cdn.robinhood.com/app_assets/fund_account/control/3x.png");
        Color color = Color.X_RAY_LIGHT;
        ThemedColor themedColor = new ThemedColor(color, color);
        String string4 = this.resources.getString(C13878R.string.fund_account_splash_button_text);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent = new PostOnboardingFundAccountSplashScreenContent(null, richText, richText2, imageSource, null, themedColor, string4);
        String string5 = this.resources.getString(C13878R.string.fund_account_detail_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        RichText richText3 = new RichText(string5, CollectionsKt.emptyList());
        String string6 = this.resources.getString(C13878R.string.fund_account_detail_subtitle);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        RichText richText4 = new RichText(string6, CollectionsKt.emptyList());
        Icon icon = Icon.CASH_24;
        String string7 = this.resources.getString(C13878R.string.fund_account_detail_value_prop_1_title);
        String string8 = this.resources.getString(C13878R.string.fund_account_detail_value_prop_1_subtitle);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        ValuePropWithIcon valuePropWithIcon = new ValuePropWithIcon(icon, string7, string8, null, null, null, null, null, null, 504, null);
        Icon icon2 = Icon.SPARKLE_BULLET_24;
        String string9 = this.resources.getString(C13878R.string.fund_account_detail_value_prop_2_title);
        String string10 = this.resources.getString(C13878R.string.gated_instant_fund_account_detail_value_prop_2_subtitle);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        ValuePropWithIcon valuePropWithIcon2 = new ValuePropWithIcon(icon2, string9, string10, null, null, null, null, null, null, 504, null);
        Icon icon3 = Icon.LOCK_24;
        String string11 = this.resources.getString(C13878R.string.fund_account_detail_value_prop_3_title);
        String string12 = this.resources.getString(C13878R.string.fund_account_detail_value_prop_3_subtitle);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        List listListOf = CollectionsKt.listOf((Object[]) new ValuePropWithIcon[]{valuePropWithIcon, valuePropWithIcon2, new ValuePropWithIcon(icon3, string11, string12, null, null, null, null, null, null, 504, null)});
        String string13 = this.resources.getString(C13878R.string.fund_account_detail_disclosure_text);
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        RichText richText5 = new RichText(string13, CollectionsKt.listOf(new RichTextAttribute(37, 17, this.resources.getString(C13878R.string.fund_account_detail_disclosure_link), RichTextStyle.UNDERLINED, null)));
        String string14 = this.resources.getString(C13878R.string.fund_account_detail_button_text);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        return new PostOnboardingFundAccountContentResponse(postOnboardingFundAccountSplashScreenContent, new PostOnboardingFundAccountDetailScreenContent(richText3, richText4, listListOf, richText5, string14, null));
    }

    private final PostOnboardingFundAccountContentResponse getFallbackResponseGB() throws Resources.NotFoundException {
        String string2 = this.resources.getString(C13878R.string.fund_account_splash_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RichText richText = new RichText(string2, CollectionsKt.emptyList());
        String string3 = this.resources.getString(C13878R.string.fund_account_splash_subtitle_gb);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        RichTextStyle richTextStyle = RichTextStyle.UNDERLINED;
        RichText richText2 = new RichText(string3, CollectionsKt.listOf(new RichTextAttribute(EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 28, "robinhood://queued_deposit_learn_more", richTextStyle, null, 16, null)));
        ImageSource imageSource = new ImageSource("https://cdn.robinhood.com/app_assets/fund_account/control/1x.png", "https://cdn.robinhood.com/app_assets/fund_account/control/2x.png", "https://cdn.robinhood.com/app_assets/fund_account/control/3x.png");
        Color color = Color.X_RAY_LIGHT;
        ThemedColor themedColor = new ThemedColor(color, color);
        String string4 = this.resources.getString(C13878R.string.fund_account_splash_button_text);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent = new PostOnboardingFundAccountSplashScreenContent(null, richText, richText2, imageSource, null, themedColor, string4);
        String string5 = this.resources.getString(C13878R.string.fund_account_detail_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        RichText richText3 = new RichText(string5, CollectionsKt.emptyList());
        String string6 = this.resources.getString(C13878R.string.fund_account_detail_subtitle);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        RichText richText4 = new RichText(string6, CollectionsKt.emptyList());
        Icon icon = Icon.CASH_24;
        String string7 = this.resources.getString(C13878R.string.gated_options_fund_account_detail_value_prop_1_title_gb);
        String string8 = this.resources.getString(C13878R.string.gated_options_fund_account_detail_value_prop_1_subtitle_gb);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        ValuePropWithIcon valuePropWithIcon = new ValuePropWithIcon(icon, string7, string8, null, null, null, null, null, null, 504, null);
        Icon icon2 = Icon.LOCK_24;
        String string9 = this.resources.getString(C13878R.string.fund_account_detail_value_prop_3_title);
        String string10 = this.resources.getString(C13878R.string.fund_account_detail_value_prop_3_subtitle);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        List listListOf = CollectionsKt.listOf((Object[]) new ValuePropWithIcon[]{valuePropWithIcon, new ValuePropWithIcon(icon2, string9, string10, null, null, null, null, null, null, 504, null)});
        String string11 = this.resources.getString(C13878R.string.fund_account_detail_disclosure_text_gb);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        RichText richText5 = new RichText(string11, CollectionsKt.listOf(new RichTextAttribute(44, 10, this.resources.getString(C13878R.string.fund_account_detail_disclosure_link_gb), richTextStyle, null)));
        String string12 = this.resources.getString(C13878R.string.fund_account_detail_button_text);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        return new PostOnboardingFundAccountContentResponse(postOnboardingFundAccountSplashScreenContent, new PostOnboardingFundAccountDetailScreenContent(richText3, richText4, listListOf, richText5, string12, this.resources.getString(C13878R.string.fund_account_detail_exit_button_text)));
    }
}
