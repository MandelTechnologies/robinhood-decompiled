package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.margin.C20999R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;

/* compiled from: InstantUpgradeRetirementSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"com/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashFragment$retirementOnboardingOverlay$2$1", "Lcom/robinhood/scarlet/ScarletOverlay;", "styleReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "priority", "", "getPriority", "()I", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashFragment$retirementOnboardingOverlay$2$1, reason: use source file name */
/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementSplashFragment3 implements ScarletOverlay {
    private final DirectResourceReference<StyleResource> styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, C20999R.style.ThemeOverlay_Robinhood_DesignSystem_RetirementOnboarding);
    private final int priority = 201;

    InstantUpgradeRetirementSplashFragment3() {
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public DirectResourceReference<StyleResource> getStyleReference() {
        return this.styleReference;
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return this.priority;
    }
}
