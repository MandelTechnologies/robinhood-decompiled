package com.robinhood.android;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.g11n.Locales;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TemporalFormatterLifecycleListener.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/TemporalFormatterLifecycleListener;", "Lcom/robinhood/utils/AppInitializedListener;", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "userLocalityPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/prefs/StringPreference;)V", "onAppInitialized", "", "app", "Landroid/app/Application;", "onUserStateChanged", "context", "Landroid/content/Context;", "newState", "Lcom/robinhood/android/util/login/UserLifecycleListener$State;", "setTemporalFormatterForLocality", "applicationContext", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TemporalFormatterLifecycleListener implements AppInitializedListener, UserLifecycleListener {
    private final StringPreference userLocalityPref;

    /* compiled from: TemporalFormatterLifecycleListener.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserLifecycleListener.State.values().length];
            try {
                iArr[UserLifecycleListener.State.LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserLifecycleListener.State.LOGGED_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TemporalFormatterLifecycleListener(@UserLocalityPref StringPreference userLocalityPref) {
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        this.userLocalityPref = userLocalityPref;
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        setTemporalFormatterForLocality(app);
    }

    @Override // com.robinhood.android.util.login.UserLifecycleListener
    public void onUserStateChanged(Context context, UserLifecycleListener.State newState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newState, "newState");
        Context applicationContext = context.getApplicationContext();
        int i = WhenMappings.$EnumSwitchMapping$0[newState.ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNull(applicationContext);
            setTemporalFormatterForLocality(applicationContext);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
            Locale locale = Locale.getDefault(Locale.Category.FORMAT);
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            companion.init(locale, new C73731(applicationContext));
        }
    }

    /* compiled from: TemporalFormatterLifecycleListener.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.TemporalFormatterLifecycleListener$onUserStateChanged$1 */
    /* loaded from: classes24.dex */
    /* synthetic */ class C73731 extends FunctionReferenceImpl implements Function1<Integer, String> {
        C73731(Object obj) {
            super(1, obj, Context.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final String invoke(int i) {
            return ((Context) this.receiver).getString(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setTemporalFormatterForLocality(Context applicationContext) {
        Tuples2 tuples2M3642to;
        Locale en_sg;
        String str = this.userLocalityPref.get();
        if (str != null) {
            CountryCode companion = CountryCode.INSTANCE.getInstance(str);
            if (Intrinsics.areEqual(companion, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                en_sg = Locale.UK;
            } else if (Intrinsics.areEqual(companion, CountryCode.Supported.Singapore.INSTANCE) || Intrinsics.areEqual(companion, CountryCode.Supported.Vietnam.INSTANCE) || Intrinsics.areEqual(companion, CountryCode.Supported.Taiwan.INSTANCE) || Intrinsics.areEqual(companion, CountryCode.Supported.Thailand.INSTANCE) || Intrinsics.areEqual(companion, CountryCode.Supported.Indonesia.INSTANCE) || Intrinsics.areEqual(companion, CountryCode.Supported.Malaysia.INSTANCE) || Intrinsics.areEqual(companion, CountryCode.Supported.HongKongSARChina.INSTANCE) || Intrinsics.areEqual(companion, CountryCode.Supported.India.INSTANCE)) {
                en_sg = Locales.INSTANCE.getEN_SG();
            } else {
                if (!Intrinsics.areEqual(companion, CountryCode.Supported.UnitedStates.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Austria.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Belgium.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Bulgaria.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Croatia.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Cyprus.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Czechia.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Denmark.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Estonia.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Finland.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.France.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Germany.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Greece.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Hungary.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Iceland.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Ireland.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Italy.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Latvia.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Liechtenstein.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Lithuania.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Luxembourg.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Malta.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Netherlands.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Norway.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Poland.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Portugal.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Romania.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Slovakia.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Slovenia.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Spain.INSTANCE) && !Intrinsics.areEqual(companion, CountryCode.Supported.Sweden.INSTANCE) && !(companion instanceof CountryCode.Unsupported)) {
                    throw new NoWhenBranchMatchedException();
                }
                en_sg = Locale.US;
            }
            Configuration configuration = new Configuration(applicationContext.getResources().getConfiguration());
            configuration.setLocale(en_sg);
            Unit unit = Unit.INSTANCE;
            tuples2M3642to = Tuples4.m3642to(en_sg, applicationContext.createConfigurationContext(configuration));
            if (tuples2M3642to == null) {
                tuples2M3642to = Tuples4.m3642to(Locale.getDefault(Locale.Category.FORMAT), applicationContext);
            }
        }
        Locale locale = (Locale) tuples2M3642to.component1();
        Context context = (Context) tuples2M3642to.component2();
        TemporalFormatter.Companion companion2 = TemporalFormatter.INSTANCE;
        Intrinsics.checkNotNull(locale);
        companion2.init(locale, new C73742(context));
    }

    /* compiled from: TemporalFormatterLifecycleListener.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.TemporalFormatterLifecycleListener$setTemporalFormatterForLocality$2 */
    /* synthetic */ class C73742 extends FunctionReferenceImpl implements Function1<Integer, String> {
        C73742(Object obj) {
            super(1, obj, Context.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final String invoke(int i) {
            return ((Context) this.receiver).getString(i);
        }
    }
}
