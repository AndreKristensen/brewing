package no.ask.components;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import no.ask.repository.enteties.vo.BeerSmithVO;
import no.ask.utils.FileHandler;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class BrewController {

    private List<BeerSmithVO> brewsFromFile;

    /**
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(Model model) {

        model.addAttribute("brews", brewsFromFile);

        return "beerSmith";
    }

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String getBrewsFromFile(Model model) {

        try {
            brewsFromFile = FileHandler.getBrewsFromFile();
            model.addAttribute("brews", brewsFromFile);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return "beerSmith";
    }

    @RequestMapping(value = "/labels", method = RequestMethod.GET)
    public String labels(Model model) {

        String[] img = { "asklogo.png", "aaa.jpg", "ab.jpg", "acorn.jpg", "blackipa.jpg", "cw.jpg", "fløyenipa.jpg", "godjul.jpg", "habaneromw.jpg", "hipa.jpg", "hmw.jpg", "milkystout.jpg",
                "ogn.jpg", "po.jpg", "polaris.jpg", "wizen.jpg" };
        model.addAttribute("img", img);

        return "labels";
    }

}
