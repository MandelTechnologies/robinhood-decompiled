package com.robinhood.android.equityscreener.filters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment;
import com.robinhood.android.equityscreener.filters.IndicatorFilterFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.utils.extensions.Activity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityScreenerFiltersActivity.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0005R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFiltersActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "filter", "", "getFilter", "()Ljava/lang/String;", "filter$delegate", "Lkotlin/Lazy;", EquityScreenerFiltersActivity.EXTRA_SCREENER_ID, "getScreenerId", "screenerId$delegate", "accountNumber", "getAccountNumber", "accountNumber$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showIndicatorScreen", "indicatorKey", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityScreenerFiltersActivity extends BaseActivity {
    private static final String EXTRA_ACCOUNT_NUMBER = "accountNumber";
    private static final String EXTRA_SCREENER_FILTER_KEY = "screenerFilterKey";
    private static final String EXTRA_SCREENER_ID = "screenerId";

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber;

    /* renamed from: filter$delegate, reason: from kotlin metadata */
    private final Lazy filter;

    /* renamed from: screenerId$delegate, reason: from kotlin metadata */
    private final Lazy screenerId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public EquityScreenerFiltersActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.filter = Activity.intentExtra(this, EXTRA_SCREENER_FILTER_KEY);
        this.screenerId = Activity.intentExtra(this, EXTRA_SCREENER_ID);
        this.accountNumber = Activity.intentExtra(this, "accountNumber");
    }

    private final String getFilter() {
        return (String) this.filter.getValue();
    }

    private final String getScreenerId() {
        return (String) this.screenerId.getValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Fragment fragmentNewInstance;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            String filter = getFilter();
            if (filter != null) {
                fragmentNewInstance = IndicatorFilterFragment.INSTANCE.newInstance((Parcelable) new IndicatorFilterFragment.Args(getScreenerId(), getAccountNumber(), filter));
            } else {
                fragmentNewInstance = EquityScreenerFilterFragment.INSTANCE.newInstance((Parcelable) new EquityScreenerFilterFragment.Args(getScreenerId(), getAccountNumber()));
            }
            setFragment(C11048R.id.fragment_container, fragmentNewInstance);
        }
    }

    public final void showIndicatorScreen(String indicatorKey) {
        Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
        showBackArrowIcon();
        replaceFragment(IndicatorFilterFragment.INSTANCE.newInstance((Parcelable) new IndicatorFilterFragment.Args(getScreenerId(), getAccountNumber(), indicatorKey)));
    }

    /* compiled from: EquityScreenerFiltersActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFiltersActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ScreenerFilters;", "<init>", "()V", "EXTRA_SCREENER_FILTER_KEY", "", "EXTRA_SCREENER_ID", "EXTRA_ACCOUNT_NUMBER", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.ScreenerFilters> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.ScreenerFilters key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) EquityScreenerFiltersActivity.class);
            intent.putExtra(EquityScreenerFiltersActivity.EXTRA_SCREENER_FILTER_KEY, key.getFilterKey());
            intent.putExtra(EquityScreenerFiltersActivity.EXTRA_SCREENER_ID, key.getScreenerId());
            intent.putExtra("accountNumber", key.getAccountNumber());
            return intent;
        }
    }
}
