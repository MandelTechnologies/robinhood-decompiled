package com.robinhood.android.microgramsdui.control;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.EmbeddedSectionResponse;
import com.robinhood.microgram.sdui.InitialScreenData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;
import microgram.p507ui.p508v1.EmbeddedSectionReadyResponseDto;
import microgram.p507ui.p508v1.InitialScreenDataDto;

/* compiled from: UiInitializer.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017J4\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0004\u0018\u0001`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003j\u0004\u0018\u0001`\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "", "startEmbeddedSection", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionResponse;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionResponse;", "launchArgument", "", "isDynamic", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startRouter", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "deeplink", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startFromLegacyLaunchService", "Lcom/robinhood/android/microgramsdui/control/UiController;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startFromProtoLaunchService", "Component", "Companion", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface UiInitializer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: UiInitializer.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiInitializer$Component;", "", "uiInitializer", "Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "getUiInitializer", "()Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Component {
        UiInitializer getUiInitializer();
    }

    Object startEmbeddedSection(String str, boolean z, Continuation<? super UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto>> continuation);

    Object startFromLegacyLaunchService(Continuation<? super UiController> continuation);

    Object startFromProtoLaunchService(Continuation<? super UiController> continuation);

    Object startRouter(String str, Continuation<? super UiObject<InitialScreenData, InitialScreenDataDto>> continuation);

    /* compiled from: UiInitializer.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiInitializer$Companion;", "", "<init>", "()V", "uiInitializer", "Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "Lmicrogram/android/inject/MicrogramComponent;", "getUiInitializer", "(Lmicrogram/android/inject/MicrogramComponent;)Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final UiInitializer getUiInitializer(MicrogramComponent microgramComponent) {
            Intrinsics.checkNotNullParameter(microgramComponent, "<this>");
            return ((Component) microgramComponent).getUiInitializer();
        }
    }
}
