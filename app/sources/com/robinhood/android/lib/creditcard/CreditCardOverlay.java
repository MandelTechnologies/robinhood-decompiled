package com.robinhood.android.lib.creditcard;

import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;

/* compiled from: CreditCardOverlay.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/creditcard/CreditCardOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "()V", "styleReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "Lcom/robinhood/scarlet/util/resource/StyleReference;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "priority", "", "getPriority", "()I", "feature-lib-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreditCardOverlay implements ScarletOverlay {
    public static final CreditCardOverlay INSTANCE = new CreditCardOverlay();
    private static final ResourceReferences4<StyleResource> styleReference = new DirectResourceReference(ResourceType.STYLE.INSTANCE, C20264R.style.ThemeOverlay_Robinhood_DesignSystem_CreditCard_Night);
    private static final int priority = 600;
    public static final int $stable = ResourceReferences4.$stable;

    private CreditCardOverlay() {
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public ResourceReferences4<StyleResource> getStyleReference() {
        return styleReference;
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return priority;
    }
}
