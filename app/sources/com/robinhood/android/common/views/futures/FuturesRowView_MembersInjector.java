package com.robinhood.android.common.views.futures;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.views.BaseInstrumentRowView_MembersInjector;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesRowView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/views/futures/FuturesRowView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/views/futures/FuturesRowView;", "viewModePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "duxo", "Lcom/robinhood/android/common/views/futures/FuturesRowViewDuxo;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FuturesRowView_MembersInjector implements MembersInjector<FuturesRowView> {
    private final Provider<FuturesRowViewDuxo> duxo;
    private final Provider<StringPreference> viewModePreference;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<FuturesRowView> create(Provider<StringPreference> provider, Provider<FuturesRowViewDuxo> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectDuxo(FuturesRowView futuresRowView, FuturesRowViewDuxo futuresRowViewDuxo) {
        INSTANCE.injectDuxo(futuresRowView, futuresRowViewDuxo);
    }

    public FuturesRowView_MembersInjector(Provider<StringPreference> viewModePreference, Provider<FuturesRowViewDuxo> duxo) {
        Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        this.viewModePreference = viewModePreference;
        this.duxo = duxo;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FuturesRowView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseInstrumentRowView_MembersInjector.Companion companion = BaseInstrumentRowView_MembersInjector.INSTANCE;
        StringPreference stringPreference = this.viewModePreference.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion.injectViewModePreference(instance, stringPreference);
        Companion companion2 = INSTANCE;
        FuturesRowViewDuxo futuresRowViewDuxo = this.duxo.get();
        Intrinsics.checkNotNullExpressionValue(futuresRowViewDuxo, "get(...)");
        companion2.injectDuxo(instance, futuresRowViewDuxo);
    }

    /* compiled from: FuturesRowView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/views/futures/FuturesRowView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/views/futures/FuturesRowView;", "viewModePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "duxo", "Lcom/robinhood/android/common/views/futures/FuturesRowViewDuxo;", "injectDuxo", "", "instance", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<FuturesRowView> create(Provider<StringPreference> viewModePreference, Provider<FuturesRowViewDuxo> duxo) {
            Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            return new FuturesRowView_MembersInjector(viewModePreference, duxo);
        }

        @JvmStatic
        public final void injectDuxo(FuturesRowView instance, FuturesRowViewDuxo duxo) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            instance.setDuxo(duxo);
        }
    }
}
