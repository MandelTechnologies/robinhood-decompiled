package com.robinhood.store.base;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarketHoursManager.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/store/base/MarketHoursManager;", "", "areMarketsOpenExtended", "", "streamIsAdtHours", "Lio/reactivex/Observable;", "marketChangesObservable", "Stub", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface MarketHoursManager {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean areMarketsOpenExtended();

    Observable<Boolean> marketChangesObservable();

    Observable<Boolean> streamIsAdtHours();

    /* compiled from: MarketHoursManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00050\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/base/MarketHoursManager$Stub;", "Lcom/robinhood/store/base/MarketHoursManager;", "<init>", "()V", "areMarketsOpenExtended", "", "streamIsAdtHours", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "marketChangesObservable", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.base.MarketHoursManager$Stub, reason: from kotlin metadata */
    /* loaded from: classes12.dex */
    public static final class Companion implements MarketHoursManager {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // com.robinhood.store.base.MarketHoursManager
        public boolean areMarketsOpenExtended() {
            return false;
        }

        private Companion() {
        }

        @Override // com.robinhood.store.base.MarketHoursManager
        public Observable<Boolean> streamIsAdtHours() {
            Observable<Boolean> observableJust = Observable.just(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.MarketHoursManager
        public Observable<Boolean> marketChangesObservable() {
            Observable<Boolean> observableJust = Observable.just(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
    }
}
