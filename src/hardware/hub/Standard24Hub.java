package hardware.hub;

import enums.Bandwidth;
import enums.LinkTypes;
import exceptions.BadCallException;

import java.util.ArrayList;

public class Standard24Hub extends AbstractHub
{

    /**
     * Constructeur à appeller
     */
    public Standard24Hub() throws BadCallException {
        super(new ArrayList<LinkTypes>(){{
                  add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH); add(LinkTypes.ETH);
              }},
                new ArrayList<Bandwidth>(){{
                    add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G); add(Bandwidth.ETH_1G);
                }}, 100);
    }
}