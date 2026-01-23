package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramScreenDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenViewState;", "", "<init>", "()V", "Loading", "Success", "Lcom/robinhood/microgram/sdui/ScreenViewState$Loading;", "Lcom/robinhood/microgram/sdui/ScreenViewState$Success;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.ScreenViewState, reason: use source file name */
/* loaded from: classes13.dex */
public abstract class MicrogramScreenDuxo3 {
    public static final int $stable = 0;

    public /* synthetic */ MicrogramScreenDuxo3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenViewState$Loading;", "Lcom/robinhood/microgram/sdui/ScreenViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.ScreenViewState$Loading */
    public static final /* data */ class Loading extends MicrogramScreenDuxo3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 71897229;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private MicrogramScreenDuxo3() {
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenViewState$Success;", "Lcom/robinhood/microgram/sdui/ScreenViewState;", "screen", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/AnyScreen;", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lcom/robinhood/microgram/sdui/ScreenType;)V", "getScreen", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "getScreenType", "()Lcom/robinhood/microgram/sdui/ScreenType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.ScreenViewState$Success, reason: from toString */
    public static final /* data */ class Success extends MicrogramScreenDuxo3 {
        public static final int $stable = 8;
        private final UiObject<?, ?> screen;
        private final RouterMessage5 screenType;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, UiObject uiObject, RouterMessage5 routerMessage5, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = success.screen;
            }
            if ((i & 2) != 0) {
                routerMessage5 = success.screenType;
            }
            return success.copy(uiObject, routerMessage5);
        }

        public final UiObject<?, ?> component1() {
            return this.screen;
        }

        /* renamed from: component2, reason: from getter */
        public final RouterMessage5 getScreenType() {
            return this.screenType;
        }

        public final Success copy(UiObject<?, ?> screen, RouterMessage5 screenType) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            return new Success(screen, screenType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.screen, success.screen) && this.screenType == success.screenType;
        }

        public int hashCode() {
            return (this.screen.hashCode() * 31) + this.screenType.hashCode();
        }

        public String toString() {
            return "Success(screen=" + this.screen + ", screenType=" + this.screenType + ")";
        }

        public final UiObject<?, ?> getScreen() {
            return this.screen;
        }

        public final RouterMessage5 getScreenType() {
            return this.screenType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UiObject<?, ?> screen, RouterMessage5 screenType) {
            super(null);
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            this.screen = screen;
            this.screenType = screenType;
        }
    }
}
