package com.robinhood.android.account.p060ui.margin;

import android.text.Spanned;
import com.robinhood.android.brokeragecontent.BrokerageResource;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.OtherMarkdown;
import io.noties.markwon.Markwon;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginInvestingLearnMoreDialogDuxo.kt */
@Metadata(m3635d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogViewState;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "markwon", "Lio/noties/markwon/Markwon;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lio/noties/markwon/Markwon;Lcom/robinhood/android/udf/DuxoBundle;)V", "marginTerminologyResource", "com/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogDuxo$marginTerminologyResource$1", "Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogDuxo$marginTerminologyResource$1;", "onCreate", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class MarginInvestingLearnMoreDialogDuxo extends BaseDuxo4<MarginInvestingLearnMoreDialogViewState> {
    public static final int $stable = 8;
    private final BrokerageResourceManager brokerageResourceManager;
    private final MarginInvestingLearnMoreDialogDuxo2 marginTerminologyResource;
    private final Markwon markwon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo$marginTerminologyResource$1] */
    public MarginInvestingLearnMoreDialogDuxo(BrokerageResourceManager brokerageResourceManager, Markwon markwon, DuxoBundle duxoBundle) {
        super(new MarginInvestingLearnMoreDialogViewState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.brokerageResourceManager = brokerageResourceManager;
        this.markwon = markwon;
        this.marginTerminologyResource = new BrokerageResource<OtherMarkdown>() { // from class: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo$marginTerminologyResource$1
            @Override // com.robinhood.android.brokeragecontent.BrokerageResource
            public String getSgContentfulId() {
                return BrokerageResource.DefaultImpls.getSgContentfulId(this);
            }

            @Override // com.robinhood.android.brokeragecontent.BrokerageResource
            public String getContentfulId() {
                return "1SUHFdyQefza1M8x8lI3Ew";
            }

            @Override // com.robinhood.android.brokeragecontent.BrokerageResource
            public String getUkContentfulId() {
                return "4tFXFquvX4V8MNbKKl2lHy";
            }
        };
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Single map = this.brokerageResourceManager.loadResource(this.marginTerminologyResource).map(new Function() { // from class: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final Spanned apply(OtherMarkdown it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MarginInvestingLearnMoreDialogDuxo.this.markwon.toMarkdown(it.getMarkdown2());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInvestingLearnMoreDialogDuxo.onCreate$lambda$0(this.f$0, (Spanned) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialogDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInvestingLearnMoreDialogDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(MarginInvestingLearnMoreDialogDuxo marginInvestingLearnMoreDialogDuxo, Spanned spanned) {
        marginInvestingLearnMoreDialogDuxo.applyMutation(new MarginInvestingLearnMoreDialogDuxo3(spanned, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(MarginInvestingLearnMoreDialogDuxo marginInvestingLearnMoreDialogDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        marginInvestingLearnMoreDialogDuxo.applyMutation(new MarginInvestingLearnMoreDialogDuxo4(null));
        return Unit.INSTANCE;
    }
}
