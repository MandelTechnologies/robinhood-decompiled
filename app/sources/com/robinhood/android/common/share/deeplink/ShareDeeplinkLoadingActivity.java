package com.robinhood.android.common.share.deeplink;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ShareDeeplinkLoadingActivity.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/share/deeplink/ShareDeeplinkLoadingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getGbShareIntentExcludingFacebookAndTwitter", "Landroid/content/Intent;", "content", "", "getDefaultShareIntent", "Companion", "feature-share-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ShareDeeplinkLoadingActivity extends BaseActivity {
    public static final String ARG_FACEBOOK_APP = "facebook";
    public static final String ARG_TWITTER = "twitter";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public UserStore userStore;

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Single<R> map = getUserStore().getUser().firstOrError().map(new Function() { // from class: com.robinhood.android.common.share.deeplink.ShareDeeplinkLoadingActivity.onCreate.1
            @Override // io.reactivex.functions.Function
            public final Intent apply(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                if (Intrinsics.areEqual(user.getOrigin().getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    ShareDeeplinkLoadingActivity shareDeeplinkLoadingActivity = ShareDeeplinkLoadingActivity.this;
                    return shareDeeplinkLoadingActivity.getGbShareIntentExcludingFacebookAndTwitter(((ShareDeeplinkIntentKey) ShareDeeplinkLoadingActivity.INSTANCE.getExtras((Activity) shareDeeplinkLoadingActivity)).getContent());
                }
                ShareDeeplinkLoadingActivity shareDeeplinkLoadingActivity2 = ShareDeeplinkLoadingActivity.this;
                return shareDeeplinkLoadingActivity2.getDefaultShareIntent(((ShareDeeplinkIntentKey) ShareDeeplinkLoadingActivity.INSTANCE.getExtras((Activity) shareDeeplinkLoadingActivity2)).getContent());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.share.deeplink.ShareDeeplinkLoadingActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareDeeplinkLoadingActivity.onCreate$lambda$0(this.f$0, (Intent) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.share.deeplink.ShareDeeplinkLoadingActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareDeeplinkLoadingActivity.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(ShareDeeplinkLoadingActivity shareDeeplinkLoadingActivity, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        shareDeeplinkLoadingActivity.startActivities(new Intent[]{intent});
        shareDeeplinkLoadingActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(ShareDeeplinkLoadingActivity shareDeeplinkLoadingActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        shareDeeplinkLoadingActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent getGbShareIntentExcludingFacebookAndTwitter(String content) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", content);
        intent.setType("text/plain");
        String string2 = getString(C11048R.string.general_share_chooser_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Intent intentCreateChooser = Intent.createChooser(intent, string2);
        List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivities) {
            ResolveInfo resolveInfo = (ResolveInfo) obj;
            String packageName = resolveInfo.activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            Locale.Category category = Locale.Category.DISPLAY;
            Locale locale = Locale.getDefault(category);
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = packageName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) ARG_FACEBOOK_APP, false, 2, (Object) null)) {
                String packageName2 = resolveInfo.activityInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
                Locale locale2 = Locale.getDefault(category);
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String lowerCase2 = packageName2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) ARG_TWITTER, false, 2, (Object) null)) {
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            arrayList2.add(new ComponentName(activityInfo.packageName, activityInfo.name));
        }
        intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (ComponentName[]) arrayList2.toArray(new ComponentName[0]));
        Intrinsics.checkNotNull(intentCreateChooser);
        return intentCreateChooser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent getDefaultShareIntent(String content) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", content);
        intent.setType("text/plain");
        String string2 = getString(C11048R.string.general_share_chooser_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Intent intentCreateChooser = Intent.createChooser(intent, string2);
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }

    /* compiled from: ShareDeeplinkLoadingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/share/deeplink/ShareDeeplinkLoadingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/common/share/deeplink/ShareDeeplinkLoadingActivity;", "Lcom/robinhood/android/common/share/deeplink/ShareDeeplinkIntentKey;", "<init>", "()V", "ARG_TWITTER", "", "ARG_FACEBOOK_APP", "feature-share-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<ShareDeeplinkLoadingActivity, ShareDeeplinkIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public ShareDeeplinkIntentKey getExtras(ShareDeeplinkLoadingActivity shareDeeplinkLoadingActivity) {
            return (ShareDeeplinkIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, shareDeeplinkLoadingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, ShareDeeplinkIntentKey shareDeeplinkIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, shareDeeplinkIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, ShareDeeplinkIntentKey shareDeeplinkIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, shareDeeplinkIntentKey);
        }
    }
}
