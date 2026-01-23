package com.robinhood.android.matcha.p177ui.incentives;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.social.contracts.matcha.MatchaIncentiveLearnMoreFragmentKey;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: MatchaIncentivesLearnMoreViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState;", "", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loading;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MatchaIncentivesLearnMoreViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: MatchaIncentivesLearnMoreViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loading;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState;", "mock", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded;", "<init>", "(Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded;)V", "getMock", "()Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements MatchaIncentivesLearnMoreViewState {
        public static final int $stable = 8;
        private final Loaded mock;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, Loaded loaded, int i, Object obj) {
            if ((i & 1) != 0) {
                loaded = loading.mock;
            }
            return loading.copy(loaded);
        }

        /* renamed from: component1, reason: from getter */
        public final Loaded getMock() {
            return this.mock;
        }

        public final Loading copy(Loaded mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            return new Loading(mock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.mock, ((Loading) other).mock);
        }

        public int hashCode() {
            return this.mock.hashCode();
        }

        public String toString() {
            return "Loading(mock=" + this.mock + ")";
        }

        public Loading(Loaded mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            this.mock = mock;
        }

        public /* synthetic */ Loading(Loaded loaded, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Companion.loadingMock : loaded);
        }

        public final Loaded getMock() {
            return this.mock;
        }
    }

    /* compiled from: MatchaIncentivesLearnMoreViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState;", "titleResource", "Lcom/robinhood/utils/resource/StringResource;", "bullets", "", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded$Bullet;", "footerContext", "Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;)V", "getTitleResource", "()Lcom/robinhood/utils/resource/StringResource;", "getBullets", "()Ljava/util/List;", "getFooterContext", "()Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Bullet", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded implements MatchaIncentivesLearnMoreViewState {
        public static final int $stable = 8;
        private final List<Bullet> bullets;
        private final MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext;
        private final StringResource titleResource;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, List list, MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.titleResource;
            }
            if ((i & 2) != 0) {
                list = loaded.bullets;
            }
            if ((i & 4) != 0) {
                footerContext = loaded.footerContext;
            }
            return loaded.copy(stringResource, list, footerContext);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitleResource() {
            return this.titleResource;
        }

        public final List<Bullet> component2() {
            return this.bullets;
        }

        /* renamed from: component3, reason: from getter */
        public final MatchaIncentiveLearnMoreFragmentKey.FooterContext getFooterContext() {
            return this.footerContext;
        }

        public final Loaded copy(StringResource titleResource, List<Bullet> bullets, MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext) {
            Intrinsics.checkNotNullParameter(titleResource, "titleResource");
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            Intrinsics.checkNotNullParameter(footerContext, "footerContext");
            return new Loaded(titleResource, bullets, footerContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.titleResource, loaded.titleResource) && Intrinsics.areEqual(this.bullets, loaded.bullets) && this.footerContext == loaded.footerContext;
        }

        public int hashCode() {
            return (((this.titleResource.hashCode() * 31) + this.bullets.hashCode()) * 31) + this.footerContext.hashCode();
        }

        public String toString() {
            return "Loaded(titleResource=" + this.titleResource + ", bullets=" + this.bullets + ", footerContext=" + this.footerContext + ")";
        }

        public Loaded(StringResource titleResource, List<Bullet> bullets, MatchaIncentiveLearnMoreFragmentKey.FooterContext footerContext) {
            Intrinsics.checkNotNullParameter(titleResource, "titleResource");
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            Intrinsics.checkNotNullParameter(footerContext, "footerContext");
            this.titleResource = titleResource;
            this.bullets = bullets;
            this.footerContext = footerContext;
        }

        public final StringResource getTitleResource() {
            return this.titleResource;
        }

        public final List<Bullet> getBullets() {
            return this.bullets;
        }

        public final MatchaIncentiveLearnMoreFragmentKey.FooterContext getFooterContext() {
            return this.footerContext;
        }

        @JvmName
        public final String getTitle(Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(549313643, i, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreViewState.Loaded.<get-title> (MatchaIncentivesLearnMoreViewState.kt:21)");
            }
            StringResource stringResource = this.titleResource;
            Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String string2 = stringResource.getText(resources).toString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return string2;
        }

        /* compiled from: MatchaIncentivesLearnMoreViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded$Bullet;", "", "titleResource", "Lcom/robinhood/utils/resource/StringResource;", "descriptionResource", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitleResource", "()Lcom/robinhood/utils/resource/StringResource;", "getDescriptionResource", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "description", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class Bullet {
            public static final int $stable = StringResource.$stable;
            private final StringResource descriptionResource;
            private final StringResource titleResource;

            public static /* synthetic */ Bullet copy$default(Bullet bullet, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = bullet.titleResource;
                }
                if ((i & 2) != 0) {
                    stringResource2 = bullet.descriptionResource;
                }
                return bullet.copy(stringResource, stringResource2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getTitleResource() {
                return this.titleResource;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getDescriptionResource() {
                return this.descriptionResource;
            }

            public final Bullet copy(StringResource titleResource, StringResource descriptionResource) {
                Intrinsics.checkNotNullParameter(titleResource, "titleResource");
                Intrinsics.checkNotNullParameter(descriptionResource, "descriptionResource");
                return new Bullet(titleResource, descriptionResource);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Bullet)) {
                    return false;
                }
                Bullet bullet = (Bullet) other;
                return Intrinsics.areEqual(this.titleResource, bullet.titleResource) && Intrinsics.areEqual(this.descriptionResource, bullet.descriptionResource);
            }

            public int hashCode() {
                return (this.titleResource.hashCode() * 31) + this.descriptionResource.hashCode();
            }

            public String toString() {
                return "Bullet(titleResource=" + this.titleResource + ", descriptionResource=" + this.descriptionResource + ")";
            }

            public Bullet(StringResource titleResource, StringResource descriptionResource) {
                Intrinsics.checkNotNullParameter(titleResource, "titleResource");
                Intrinsics.checkNotNullParameter(descriptionResource, "descriptionResource");
                this.titleResource = titleResource;
                this.descriptionResource = descriptionResource;
            }

            public final StringResource getTitleResource() {
                return this.titleResource;
            }

            public final StringResource getDescriptionResource() {
                return this.descriptionResource;
            }

            @JvmName
            public final String getTitle(Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-392376205, i, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreViewState.Loaded.Bullet.<get-title> (MatchaIncentivesLearnMoreViewState.kt:31)");
                }
                StringResource stringResource = this.titleResource;
                Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String string2 = stringResource.getText(resources).toString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return string2;
            }

            @JvmName
            public final String getDescription(Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1328294131, i, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreViewState.Loaded.Bullet.<get-description> (MatchaIncentivesLearnMoreViewState.kt:36)");
                }
                StringResource stringResource = this.descriptionResource;
                Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String string2 = stringResource.getText(resources).toString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return string2;
            }
        }
    }

    /* compiled from: MatchaIncentivesLearnMoreViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState$Loaded;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Loaded loadingMock;

        private Companion() {
        }

        static {
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("--- -- -- --- ---- ---- ------- ---- ---");
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                StringResource.Companion companion = StringResource.INSTANCE;
                arrayList.add(new Loaded.Bullet(companion.invoke("--- ---- --- ----"), companion.invoke(StringsKt.repeat("-", 85))));
            }
            loadingMock = new Loaded(stringResourceInvoke, arrayList, MatchaIncentiveLearnMoreFragmentKey.FooterContext.PAY_AND_REQUEST);
        }
    }
}
